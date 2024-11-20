-- yuapi.`interface_info`
create table if not exists yuapi.`interface_info`
(
    `id` bigint not null auto_increment comment '主键' primary key,
    `name` varchar(256) not null comment '接口名称',
    `url` varchar(256) not null comment '接口地址',
    `method` varchar(256) not null comment '请求类型',
    `status` int default 0 not null comment '接口状态（0：关闭，1：开始）',
    `description` varchar(512) null comment '描述',
    `requestHeader` text null comment '请求头',
    `responseHeader` text null comment '响应头',
    `userId` bigint not null comment '创建人',
    `createTime` datetime default CURRENT_TIMESTAMP not null comment '创建时间',
    `updateTime` datetime default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    `isDeleted` tinyint default 0 not null comment '是否删除(0-未删, 1-已删)'
) comment 'yuapi.`interface_info`';

insert into yuapi.`interface_info` (`id`, `name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `userId`) values (1, 'gKzs0', 'www.shakia-bednar.co', '4NE', 300816, 'HNpLm', 'n0u', 'WWP', 5733);
insert into yuapi.`interface_info` (`id`, `name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `userId`) values (2, 'mYkZ', 'www.devon-gaylord.org', 'gJ', 48, '8j', 'Tp', 'X5', 71309378);
insert into yuapi.`interface_info` (`id`, `name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `userId`) values (3, 'u1', 'www.sol-dubuque.org', 'I4TR1', 177466, 'ppm', 'Hd', '9Kg1', 934);
insert into yuapi.`interface_info` (`id`, `name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `userId`) values (4, '3m', 'www.dorsey-kassulke.name', 'KVjal', 92, 'Y7', '2V', 'QMxbJ', 522);
insert into yuapi.`interface_info` (`id`, `name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `userId`) values (5, 'je07', 'www.chrystal-schamberger.com', '3O', 354108, 'Sk', 'JF7', 'Qy7TR', 7684250);
insert into yuapi.`interface_info` (`id`, `name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `userId`) values (6, 'fqX', 'www.kiara-moore.org', 'FCfr', 8, '4Z', 'OUu', 'Zd2', 485567);
insert into yuapi.`interface_info` (`id`, `name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `userId`) values (7, 'l0Szs', 'www.lona-bogan.org', 'sJPzS', 59, 'x6', 'wx', 'sjr8r', 2564);
insert into yuapi.`interface_info` (`id`, `name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `userId`) values (8, 's8X1', 'www.winston-osinski.co', 'iR2', 362544, 'uv', '3C', 'Vk', 68420);
insert into yuapi.`interface_info` (`id`, `name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `userId`) values (9, 'st2', 'www.ja-wiza.biz', '9bzo', 934640215, '1sj', 'n2b2o', 'fWXZn', 3);
insert into yuapi.`interface_info` (`id`, `name`, `url`, `method`, `status`, `description`, `requestHeader`, `responseHeader`, `userId`) values (10, 'tzh', 'www.keenan-will.co', 'D6jk', 5, 'G6', 'kdOh', '8RY1m', 223);