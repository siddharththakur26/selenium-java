# Introduction

This a bare minimum framework setup of java-selenium for QA Recruitment Workshop

## Tests Covered:

* UI


## Technologies used:

* Java 
* Selenium 4.0
* Serenity 



## Design Pattern used:
* Page Object Model _(POM)_


## Prerequisite:
* JDK 8
* Selenium



## Steps to Run:

1. Clone GIT repository in named directory.

    **_Run:_**
    ```
     > cd ~/workspace/
     > mkdir thoughtworks
     > git clone https://github.com/tw-qa-gurgaon/selenium-java.git
    ```     

2. Install all dependencies -

    **_Run:_**
    ```
        > cd ~/workspace/<java_directory_name>/<where_your_pom.xml_is>
        > mvn clean install
     ```       
     **Note**:This will install all dependencies project will be using for executing.
            

3. To run test - 

    **_Run:_**
    ```
    > cd ~/workspace/<java_directory_name>/<dir_from_where_you_can_run_test>
    > mvn clean verify -Dexecute.test=**/*/tests/Test
    ```

## Additional Information

* Sample report of initial execution is saved in reports folder with index.html
      
            
## Author

* Kamini Pandey
* Yash Varshney

## References

* For serenity you can refer- https://serenity-bdd.github.io/theserenitybook/latest/index.html
