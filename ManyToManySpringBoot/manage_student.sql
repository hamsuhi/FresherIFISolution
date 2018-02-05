create schema manage_student;
use manage_student;

create table `student` (
`id` int(50) NOT NULL,
`student_name` varchar(255) default null,
`address` varchar(255) default null,
`tell` varchar(255) default null,
primary key(`id`)
) engine=InnoDB default charset=utf8;

create table `course` (
`id` int(50) NOT NULL,
`course_name` varchar(255) default null,
`number_hours` int(255) default null,
primary key(`id`)
) engine=InnoDB default charset=utf8;

create table `registration` (
`student_id` int(50) not null,
`course_id` int(50) not null,
 PRIMARY KEY (`student_id`,`course_id`),
FOREIGN KEY (`developer_id`) REFERENCES `developer` (`id`),
  FOREIGN KEY (`project_id`) REFERENCES `project` (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
