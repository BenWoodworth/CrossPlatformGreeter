# CrossPlatformGreeter [![Build Status](https://travis-ci.org/BenWoodworth/CrossPlatformGreeter.svg?branch=master)](https://travis-ci.org/BenWoodworth/CrossPlatformGreeter)
This project is a simple Greeter plugin for Minecraft servers.  
What's so special about it? This plugin is cross-platform, meaning  
it can run on both Bukkit and Sponge. What makes this especially  
interesting is that the same jar can be used for either server.

Using a basic form of dependency injection, this plugin can handle  
server events, like players joining, and execute simple tasks, like  
sending players messages, all without needing to directly interact  
with the native server platform's API's.
