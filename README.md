# _Edge of the Empire API_

#### _An application that will store a database of all Edge of the Empire weapons, armor, and adversaries, as well as allow users to create/edit existing items or adversaries for their own use in a campaign._

#### By _**Anduin Mooney**_

## Description

_This is an Edge of the Empire API built using java. The purpose of this application is to store every single weapon, armor, item, attachments, and adversaries(Non-Player Character) that exist in the Star Wars roleplaying game, Edge of the Empire (Also compatible with Age of Rebellion & Force and Destiny). The API stores everything from all of the required stats for an adversary, as long as the damage of weapons. As well as storing this data, our API will also allow users to add or edit existing weapons, armor, adversaries, etc. to help make a more custom experience for a campaign in Edge of the Empire. This application currently contains a database of different weapons, armor, and adversaries, and the less important items like attachments will be added on with time, as well as a front end user interface to allow for easier viewing._

* _What is Edge of the Empire?
Edge of the empire is a Star Wars licensed tabletop role-playing game. Edge of the Empire was published by Fantasy Flight Games, the same company that helped make Warhammer 40k, as well as creating other licensed games like Game of Thrones, and the Lord of the Rings. Edge of the Empire was created by Fantasy Flight games in 2012_

* _Why did I decide to make this application?
I wanted to keep all of these different things in one database to help Game Masters access this information more easily. Instead of looking through the huge books and remembering page numbers, you're now able to access all of that information in one place, now with the added ability to create custom weapons, armor, and adversaries for your own campaign easily_

_API Examples:_

* _https://imgur.com/gallery/9MkEy_


## Setup/Installation Requirements


* _Clone repository from github_
* _Launch application with IntelliJ_
* _Run App.java_
* _Launch PostMan_

* _POST (localhost:4567/weapons/new), or (localhost:4567/armors/new) or    (localhost:4567/adversaries/new)_

* _GET ALL (localhost:4567/weapons), or (localhost:4567/armors) or    (localhost:4567/adversaries)_

* _GET BY POST ID (localhost:4567/weapons/id), or (localhost:4567/armors/id) or    (localhost:4567/adversaries/id)_

_Make sure to install Intellij or you won't be able to run this app._


### Specifications
| Behavior | Input | Output |
| :-------------     | :------------- | :-------------
|See All weapons| /weapons | All weapons |
| See weapon by ID| /weapons/:id | Blaster Rifle |
| Post new weapon| /weapons/new | Blaster Pistol|



## Known Bugs

_There are no known bugs, but please contact me if you end up finding one!_

## Support and contact details

_Contact me at anduinmooney@gmail.com_

## Technologies Used

_Java, IntelliJ, Atom. Gitbash, Spark, Handlebars, PostMan_

### License



Copyright (c) 2018 **Anduin Mooney**
