load("classpath:lib.js");

load("classpath:knihovny/lib2.js");

var ext2 = test();
execution.setVariable("resultExt2",ext2);

var extLibTest = libTest();
execution.setVariable("extLibTest",extLibTest);