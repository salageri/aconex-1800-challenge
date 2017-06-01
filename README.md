# Aconex 1800 CODING-CHALLENGE

Map a list of phone numbers to a list of words that can be made out of them using a keypad.
447363 will  output HIRE-ME
`2255.63` will  output (amongst others) "CALL-ME", 
`435 5696 753` will output "HELLO-WORLD". 

The explanation of choice, design and approach can be found in the `ExplainedCodeDesign.md` file.



## Getting Started

### Build

To build the project, just run 
'mvn clean install' or `mvn clean package`.
The built JAR along with sample dictionaries and inputs can be found in the `target` directory.

## Example usage

Read phone numbers from one or multiple input files:


Provide phone number through STDIN:
Case1 :For input Files: In Windows Navigate to say aconex-1800-challenge\target directory

And type :

java -jar eighteenhundred-1.0.0.jar -d dictionary.challenge.txt input.challenge.txt


Case2:For no input files navigate type

java -jar eighteenhundred-1.0.0.jar -d dictionary.challenge.txt

The Instructions indicate to Kindly enter the Phone Number 

Now enter the Phone Number say

2255.63 

In case you want to terminate the output 

press CtrZ and Enter 

The optional `-d` switch provides a custom dictionary of possible words to use.
The default dictionary can be found besides the JAR file.

### Test

Building with `mvn clean package` already runs unit tests.

`mvn clean verify` runs integration tests, but we can keep it aside as To do.

## Technology

- Java Stream API
- JUnit for unit tests

## Author
Bangalore India
Shrinivas Gurunath Alageri salageri@gmail.com

## Acknowledgments
Jerry and Vimal Raghav

