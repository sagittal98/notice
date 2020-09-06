
# Error messages and solutions


## Error messages

````

Caused by: java.lang.IllegalArgumentException: Could not resolve resource location pattern [classpath:com/sagittal/notice/mapping/*.xml]: class path resource [com/sagittal/notice/mapping/] cannot be resolved to URL because it does not exist

````

## solutions
### reason
> The classpath can only load the first file it finds,while the classpath* loads the same file from multiple JAE files.
> If a profile cannot be found here. Check to see if there are multiple profiles under the file. and if so, specify use classpath*.
### example
````
 <property name="mapperLocations" value="classpath*:com/sagittal/notice/mapping/*.xml" />
````




