# CircleCI-Coveralls-Testrepo
Documentation of my experience in using CirleCI and Coveralls together

## CirleCI

Setup for CircleCI was very simple. I simply clicked through the registration process and was immediately able to look at the CircleCI dashboard it even automatically gave me access to private CI-registered repositories in organizations I'm part of. When I added tests CircleCI did not immediately recognize them.

I looked at [the CircleCI 1.0 documentation](https://circleci.com/docs/1.0/configuration/) to get a feel for configuring CircleCI. There was not a lot to be configured, but it's good for future reference.

##Coveralls

Coveralls has terrible documentation. I probably wouldn't trust code quality to them with that kind of documentation.

Either way to generate reports you need to use a token. However, they implore to keep the token secret to prevent non-authorized people from generating reports. However, that conflicts with good practices like having a synchronized pom, even without the micro management.

I will not continue looking into coveralls

##Codacy

Codacy needs no documentation. I registered this repository for code quality and it just performed an analysis.
I will be making a pull request next.
