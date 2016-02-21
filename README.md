# base-template

Basic game structure, including Input Handler, Resource Loader and Bitmap Font rendering. Desktop only.

### Setup (Mac and Linux)

1. Download Eclipse

1. Install the Gradle plugin. It's needed to build Libgdx projects

1. Clone or otherwise download this repository

1. Open Eclipse and go to File -> Import. In the Import screen, select Gradle Project and click Next

1. In the next screen, hit Browse and locate the project directory. Then, click Build Model and wait for it to finish. Select all 3 directories and click Finish

1. To run the game, go to Eclipse's Run Configurations. On the left menu, select Java Application and click New Launch Configuration. In the Project field, click Browse and select `base-template-desktop`. As the Main Class, select `DesktopLauncher - com.lucasdnd.basetemplate.desktop`

### Features

#### Input

- Movement keys
- Action delay
- Controller support
- Mouse control

#### Resource Loader

- Loads fonts, sounds and sprites
- Makes resources globally available by calling `Resources.get().resourceName`
- Drawing sprites and playing sounds from the Resource Loader

#### Font

- Includes bitmap fonts
- Simple methods to draw text, supporting different colors, alignment and drop shadow

### Licenses and credits

This project is a free software, licensed under the GNU GPL v3 terms.

It also includes the free ProggyFonts and the mining sound effect by [ryanconway](http://freesound.org/people/ryanconway/sounds/240801/).
