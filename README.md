This is a layer to provide ROS Hydromedusa in an OpenEmbedded Linux system.
Currently, this layer is still under development and only provides 
cross-compilation of the basic ros-comm packages.

## MAINTAINERS ##

  * Lukas Bulwahn, BMW Car IT GmbH <lukas.bulwahn@oss.bmw-carit.de>
  * Stefan Herbrechtsmeier, Bielefeld University <stefan@herbrechtsmeier.net>


## CONTRIBUTORS ##

  * Lukas Bulwahn, BMW Car IT GmbH <lukas.bulwahn@oss.bmw-carit.de>
  * Stefan Herbrechtsmeier, Bielefeld University <stefan@herbrechtsmeier.net>
  * Tobias Weigl, BMW Car IT GmbH <tobias.weigl@bmw-carit.de>
  * Kartik Mohta <kartikmohta@gmail.com>
  * Koen Kooi <koen@dominion.thruhere.net>
  * Victor Mayoral Vilches <v.mayoralv@gmail.com>
  * Sergey 'Jin' Bostandzhyan <jin@dev.digitalstrom.org>
  * Andreas Hildisch, BMW Car IT GmbH <andreas.hildisch@bmw-carit.de>
  * William <william@friedcircuits.us>
  * Kristof Robot <krirobo@gmail.com>
  * Khem Raj <raj.khem@gmail.com>


## HOW TO CONTRIBUTE ##

  We are still working on this development and are interested in other use cases.
  If you are interested in this project, please contact us via email.
  The more people are interested, the more we will be pushing this project.
  If you want to contribute, please contact us and we can discuss open issues
  and how to join forces.


## DEPENDENCIES ##

  This layer depends on:

  URI: git://git.openembedded.org/openembedded-core  
  branch: master  
  revision: HEAD  


  URI: git://git.openembedded.org/meta-openembedded  
  layers: meta-oe  
  branch: master  
  revision: HEAD  

 bitbake > 1.20

## DEPENDENCIES ON RECENT COMMITS ##

  cv-bridge and dependent recipes, e.g., the image-transport recipes, depend on
  7568bfdd114597956a1da68746f207ec7f93a48d@openembedded-core.
  
  Some recipes that need the Eigen library, e.g., the pcl-ros recipe, depend on
  424e3c1b930c0103c2cedfd4df1671e84a5256d5@meta-openembedded.

  Using wildcards in bbappend versions part in name depends on
  31bc9af9cd56e7b318924869970e850993fafc5f@bitbake and
  991cbeedbde8bd25ce08c669b1bfac8b99e33149@bitbake

## INSTALLATION ##

  The repository contains a layer for ROS that builds on top of the
  OpenEmbedded Core layer and the meta-oe layer.

  We believe it should work with the current HEAD of the layers mentioned above.
  As a further reference, here are the version I currently work with:

  * commit d3d5ccd3275196fb9e4cb8f49d3c087b97c20ed6 of https://github.com/openembedded/oe-core
  * commit 2a463dddcf76d7fa437e96f6cf0210143e97a904 of https://github.com/openembedded/meta-oe
  * commit bf9be2029b2bded5f532bdda4c38ae3dff5d1cf6 of git://git.openembedded.org/bitbake in the bitbake directory

### Setup using repo tool

More information on [repo tool](http://source.android.com/source/downloading.html)

```bash
 $ repo init -b bmwcarit-develop -u https://github.com/b-sh/ros-embedded-manifest.git -m openembedded.xml
 $ repo sync
```

## USAGE ##

  Currently, you can cross-compile the ROS packages with the commands:

    source oe-init-build-env
    bitbake <package-name>

  Look at the meta-ros test reports for the description of the current state.

  The recipe core-image-ros-roscore provides a minimal Linux system that runs
  roscore.

  You can compile the minimal Linux system with

    bitbake core-image-ros-roscore

  Then for example, you start this system in the qemu virtual machine with

    runqemu <MACHINE> core-image-ros-roscore

  
  On the Linux system, ensure that the own host's name in resolved by adding
  
    127.0.0.1	<HOSTNAME>.localdomain		<HOSTNAME>

  to the /etc/hosts file, and set up the environment with

    export ROS_ROOT=/usr
    export ROS_MASTER_URI=http://localhost:11311
    export CMAKE_PREFIX_PATH=/usr
    touch /usr/.catkin

  Finally, you can start roscore with

    roscore

    
## LICENSE ##

  All metadata is MIT licensed unless otherwise stated. Source code included
  in tree for individual recipes is under the LICENSE stated in each recipe
  (.bb file) unless otherwise stated.
  The descriptions in the recipes of ROS packages have been extracted from
  the ROS wiki (http://www.ros.org/wiki/) and are licensed under 
  Creative Commons Attribution 3.0 (http://creativecommons.org/licenses/by/3.0/)
  unless otherwise noted.

  This README document is Copyright (C) 2012 BMW Car IT GmbH.


## REDISTRIBUTIONS ##

  The log4cxx recipe originated from the recipe in the OpenEmbedded (Classic) Development
  (cf. http://cgit.openembedded.org/openembedded/tree/recipes/log4cxx)
  licensed with the MIT License.

  The yaml-cpp recipe originated from the recipe in Kartik Mohta's OpenEmbedded layer
  (cf. https://github.com/kartikmohta/meta-km/blob/master/recipes-devtools/yaml-cpp/yaml-cpp_0.3.0.bb)
  licensed with the MIT License.

  The libpoco recipe originated from the recipe in digitalSTROM's OpenEmbedded layer
  (cf. https://gitorious.digitalstrom.org/dss-oe/dss-oe/blobs/master/dS/meta-dss11-production/recipes-support/poco/poco_1.3.6p2.bb)
  licensed with the MIT License.

  The core-image-ros-* recipes originated from the core-image-minimal recipe in OpenEmbedded Core
  (cf. http://cgit.openembedded.org/openembedded-core/tree/meta/recipes-core/images/core-image-minimal.bb)
  licensed with the MIT License.

  The original or modified files are redistributed here under the same MIT License.
