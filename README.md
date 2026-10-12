# 实验5：AspectJ 方式的 AOP

在 Spring 整合 MyBatis 业务（Admin 登录）的基础上，使用 AspectJ 方式（XML `aop:aspect`）为业务层方法添加五种通知。

## 通知清单
- 前置：带参绑定，`execution(...) and args(email,password)` + `arg-names`
- 环绕：`ProceedingJoinPoint` 取签名/参数/目标对象，`proceed()` 前后插逻辑，并演示改写返回值
- 异常：`aop:after-throwing` + `throwing="e"` 绑定异常对象
- 后置返回 / 后置

## 测试
`TestAdminMapper`、`TestAdminService` 通过；解开 login 中 `1/0` 注释可演示异常通知。
