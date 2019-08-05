# Spring(现在由Pivotal公司维护)

## Sprng容器

#### 一、spring配置的几种方式
1. 注解配置
2. Java类配置
3. xml文件配置
#### 二、注册bean的几种方式
1. @Bean注解
2. @ComponentScan注解，实现TypeFilter接口可以实现自定义的过滤器
3. @Component注解(@Controller,@Service,@Repository与这个注解相同,只是对bean进行了归类)
4. @Import，实现ImportSelector和ImportBeanDefinitionRegistrar接口
5. 实现FactoryBean接口
#### 三、bean的特性
1. 多实例@Scope("prototype"),默认单实例
2. 懒加载,@Lazy
3. 条件注册，实现condition接口
#### 四、bean的生命周期
1. 定义：指bean的--创建--初始化--销毁的过程
2. 可以自定义bean的初始化方法和销毁方法：
    1. bean.xml文件中配置或者@Bean(initMethod="init",destoryMethod="destory")
        1. 单实例:容器关闭时会调用destory()
        2. 多实例:容器只负责初始化，但不会管理bean，容器不会调用销毁方法
    2. 让bean实现InitializingBean和DisposableBean接口
    3. 使用JSR250规则定义的@PostConstruct和@PreDestory
3. BeanPostProcessor,负责在初始化方法前后调用

#### 五、容器启动及BeanPostProcessor源码分析
1. AbstractAutoWireCapableBeanFactory中的**1702**行调用BeanPostProcessor的两个实现方法


```
        Object wrappedBean = bean;
        if (mbd == null || !mbd.isSynthetic()) {
            //初始化之前调用
        	wrappedBean = applyBeanPostProcessorsBeforeInitialization(wrappedBean, beanName);
        }
        
        try {
            //调用bean的初始化方法
        	invokeInitMethods(beanName, wrappedBean, mbd);
        }
        catch (Throwable ex) {
        	throw new BeanCreationException(
        			(mbd != null ? mbd.getResourceDescription() : null),
        			beanName, "Invocation of init method failed", ex);
        }
        if (mbd == null || !mbd.isSynthetic()) {
            //初始化之后调用
        	wrappedBean = applyBeanPostProcessorsAfterInitialization(wrappedBean, beanName);
        }
```

2. 容器启动加载配置类-->refresh()-->finishBeanFactoryInitialization()-->getBean()-->doCreateBean()-->beanWrapper(对象的创建)-->populated(属性赋值)-->inializate()-->processors(各种处理器)
3. 先处理processor bean 再处理业务bean

####  六、Spring底层对BeanPostProcessor的使用
1. ApplicationContextAwareProcessor实现分析 ***待补充***
2. BeanValidationPostProcess实现分析 ***待补充***
3. InitDestroyAnnotationBeanPostProcessor实现分析***待补充***

#### 七、属性赋值
1. @Value
2. @AutoWired自动装配:Spring利用依赖注入(DI),完成对IOC容器中的各个组件的依赖关系赋值
3. @AutoWired小结:表示默认优先按类型去容器中找对应的组件,相当于anno.getBean(TestDao.class)去容器获取id为testDao的bean，并注入到TestService的bean中
4. 如果存在多个相同的TestDao,则使用@Qualifier("")来指定bean
5. 如果没有要注入的类，将@AutoWired的required属性设为false
6. @Qualifier是根据bean的id来==指定==获取testDao,不受@Primary影响
7. 通过@Primary标记的bean,它的bean默认被**首选**使用
8. @Resource和@AutoWired的区别如下:
    1. @Resource不能支持@Primary功能
    2. 不能支持@AutoWired(required=false)功能
9. @Inject和@AutoWired的区别
    1. 一样可以装配bean,并支持@Primary功能,可用于非Spring框架
    2. 不能支持@AutoWired(required=false)的功能，需要引入第三方包javax.inject
10. @AutoWired是属于Spring的，不能脱离Spring，@Resource和@Inject都是JAVA规范，推荐使用@AutoWired
#### 八、Aware注入Spring的底层组件原理
1. 自定义组件想要使用Spring容器底层的组件(ApplicationContext,BeanFactory)
2. 思路:自定义组件实现xxxAware,在创建对象的时候，会调用接口规定的方法注入到相关组件:Aware
3. 常见的XXXAware接口
    1. ApplicationContextAware接口:获取IOC容器
    2. BeanNameAware接口:获取Bean信息
    3. EmbeddedValueResolverAware接口:解析器(表达式及相关脚本的解析)

*******
补充相关代码
*******

4. 总结:把Spring底层的组件可以注入到自定义的bean中,ApplicationContextAware是利用ApplicationContextAwareProcessor来处理,其他XXXAware也类似,都有相关的Processor来处理,其实就是后置处理器处理

## Spring AOP底层源码

1. 什么AOP
    - 面向切面编程[底层就是动态代理]
    - 指程序在运行期间动态的将某段代码切入到指定方法位置进行运行的编程方式

2. AOP通知方法
    - 前置通知:logStart(),在目标方法(div)运行之前运行(@Before)
    - 后置通知:logEnd(),在目标方法(div)运行结束之后运行,无论正常或异常结束(@After)
    - 返回通知:logReturn(),在目标方法(div)正常返回之后运行(@AfterReturning)
    - 异常通知:logException(),在目标方法(div)出现异常后运行(@AfterThrowing)
    - 环绕通知:动态代理,最底层通知,手动指定执行目标方法(@Around)
3. @EnableAspectJAutoProxy核心注解
    1. proxyTargetClass():控制aop的具体实现方式,true表示使用cglib,false表示使用java的Proxy，默认为false
    2. exposeProxy():控制代理的暴露方式,true使用ThreadLocal的方式(主要是线程安全问题),默认为false。

4. AnnotationAwareAspectJAutoProxyCreator核心类的过程分析

> > >查看UML图

5. AOP核心流程

> > > 待补充

6. AnnotationAwareAspectJAutoProxyCreator创建回顾

> > > 待补充

7. AnnotationAwareAspectJAutoProxyCreator如何拦截Bean的创建

> > > 待补充

8. AOP的调用过程

> > > 待补充

9. AOP流程梳理及总结

> > > 待补充


10. 什么是声明式事务
    1. 以方法为单位，进行事务控制；抛出异常，事务回滚
    2. 最小的执行单位为方法。决定执行成败是通过是否抛出异常来判断的，抛出异常则执行失败
    3. 哪些情况下Spring的事务管理会失效
        - private 方法
        - final 方法
        - static 方法
        
        原因:由于Java继承时,不能重写private,final,static修饰的方法。所以，所有的private方法,final方法和static方法都无法直接添加事务管理功能

11. Spring的声明式事务的实现
    1. @Transactional事务注解
    2. @EnableTransactionManagement事务管理器注解
12. 声明式事务源码分析
    1. @EnableTransactionManagement注解开启事务管理器
    2. 注册AutoProxyRegistrar和ProxyTransactionManagenmentConfiguration
    3. 核心组件InfrastructureAdvisorProxyCreator注册

## SpringMvc
1. 常用的WEB三大组件:在web.xml配置使用
    1. servlet
    2. filter
    3. listener
2. ServletContainerInitializer初始化web容器
    - 注冊servlet或者filters等,servlet规范中通过ServletContainerInitializer实现此功能
    - HandlesTypes注解引入感兴趣的类
    - 实战及测试结果分析
    
    
    


3. 使用ServletContext注册三大组件
    1. @WebServlet注解

4. Servlet与SpringMVC的整合分析

> > >

5. SpringMvc根容器和子容器区别

6. SpringMvc整合流程

7. 定制化SpringMvc

8. 什么是同步处理

9. 同步处理的原理

10. Servlet3.0异步处理
11. 异步处理原理
12. SpringMvc的异步处理,两种方式可实现异步
    1. Callable<T>
    2. DeferredResult<T>
13. 异步处理小实战
14. SpringMvc总结
