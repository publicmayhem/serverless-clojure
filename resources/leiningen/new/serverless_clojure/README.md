# {{name}}

This creates a Serverless project capable of creating AWS Lambda functions using clojure code.

The example code generates follows the following tutorial
[Writing AWS Lambda Functions in Clojure](https://aws.amazon.com/blogs/compute/clojure/ "Writing AWS Lambda Functions in Clojure").
creating the first two handlers, handler and handlerpojo.

## Prerequisites

You will need [Leiningen] 2.0.0 or above installed.
You will need [Serverless] installed and configured and able to deploy and invoke the basic examples.

[leiningen]: https://github.com/technomancy/leiningen
[Serverless]: https://serverless.com/ 
## Running

Create an Uberjar of the project
> lein uberjar

Then deploy with serverless
> serverless deploy

As part of the Serverless output you should see something along the lines of 
functions:
  hello: test-dev-hello
  
You can now invoke this function as:
> serverless invoke -f hello -l --data "Joe"

And if all is well, you should see output as
"Hello Joe!"

For the pojo test invoke as
> serverless invoke -f hellopojo -l --data "{\"firstName\" : \"John\", \"lastName\" : \"Smith\"}"

And you should see output as "Hello John Smith"

## License

[MIT](/LICENSE)

Copyright © 2017 publicmayhem
