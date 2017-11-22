# Paper 1

## 2.1. Repellent spread

During the creation of the model in NetLogo, the necessity for some abstraction for the presence and spread of repellent had previously been established, though the nature of that abstraction was still to be determined. Eventually, though, an abstraction was settled upon, in the form of a value stored within each square on the map, which would then be represented by a colour value on that square.

In the model itself, the map consists of a grid of squares, or "patches", each having its own two-dimensional grid reference and holding pre-defined variables such as colour value, which could be specified with a keyword ("red", "blue", "green" and so on), a value representing the model's own colour pallette, or an RGB value. In addition, to facilitate the necessary abstractions, these patches were given two additional variables to store a value representing the amount of repellent on that patch and the pheromones that would be emitted by ants in the model, plus an additional two "temporary" variables to facilitate modifying both values without prematurely destroying data until all processes dependent on that data were completed. The values that could be stored in these variables range from 0 to 255, with 255 being the maximum amount of repellent or pheromones at a single patch. This decision ultimately allowed for the representation of these values by passing them into an RGB value, with the red colour channel representing repellent levels and the green channel representing pheromones.

Placing the repellent on the map was initially performed with a single mouse click upon the spot the user wished to drop repellent. The amount placed depends on a slider provided in the model's user interface, which specifies a value between 0 and 255. Upon clicking, the patch's repellent value is set to the value specified by the slider, which in turn affects the red channel of that patch's colour value. This, however, did not accurately represent the deployment of repellent in the original experiments that the model was intended to emulate. And alternative approach was thus devised in which a mass of repellent, much like the soaked filter paper used could be dropped into the model at once, immediately covering an area of the map and instantly setting the repellent values within a range of patches, the size of this virtual filter paper being once again specified by sliders that set the percentage of the containter's width and height to cover. Once this was quickly applied, the release of repellent had become more representative of the original experiment.

The repellent, of course, would also need to spread out across any available open space, much like any gas would, presenting the requirement for additional abstractions. As such, the model presents this spread by transferring a user-defined percentage of each patch's repellent value to each of its nearby neighbours that possesses a repellent value lower than the origin patch. This is performed on each of NetLogo's cycles, known as ticks, ultimately resulting in a visible simulation of the spread of that repellent.

Most of the user-defined variables that dictated the placement and behaviour of the repellent in the model is presented to users by way of a number of sliders around the model, in a layout designed to make use of the potentially limited window space of the model in common display resolutions as well as allowing for easy and quick identification of each slider (for example, sliders that affect the likes of horizontal positioning of the repellent would reside along bottom of the model area, while sliders affecting vertical values would sit along the side). These sliders allow the user to define not only the width and height of the patch of repellent placed, but also their initial values and the rate of spread from each patch to its neighbours. In addition, another slider provides the option to artificially "decay" existing repellent each tick, though this behaviour did not see a great deal of user over the course of the model's development, in part as a result of the gradual refinement of spread behaviour.

A number of difficulties arosse in the process of modelling repellent and the manner in which it spreads, primarily in the transferrence of repellent from one patch to another. An initial problem arose in initial attempts to model the spread of repellent, both in all eight directions and in the four cardinal directions, in that after a point, the repellent did not spread consistently and the resulting visual representation appeared to be what could be best described as an accidental representation of Conway's Game of Life. This was ultimately resolved with the realisation that NetLogo not only selects all patches in a random sequence, but also does not preserve and operate on old values as a default behaviour, hence the requirement for temporary values to which the repellent and pheromone values can be copied and used as a consistent reference instead of their more volatile counterparts, ultimately leading to a consistent spread.

However, after a point, and with some extreme user settings, it does remain possible to duplicate that Game of Life effect, though the decision was reached that, though unintended, it does seem a somewhat accurate representation of the repellent's behaviour.

* Means of abstraction
* Representation of repellent
* Placement of repellent
* Spread of repellent
* Implementation of repellent in model
  * User Interface
  * Variables
* Difficulties faced

## 2.2. Room/Map setup
* Means of abstraction
* Representation of environment
* Placement of walls
* Placement of exit
* Placement of repellent
  * (May already be explained in prior section)
* Wall behaviour
* Open space behaviour
* Implementation of map in model
  * User Interface
  * Variables
* Difficulties faced

### EXTERNAL NOTES ABOUT TEXT
* Miiiiiiight want to switcheroo these two sections tbh...
