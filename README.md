# Minecraft Lib API

A lightweight and modular library for **Spigot/Paper** plugins that provides reusable managers and utilities to simplify Minecraft plugin development.

> **Status:** 🚧 Under Development

## Features

* 📋 Scoreboard Manager
* 👤 Player Head Utilities
* 🏷️ BossBar Manager
* ⭐ Experience Bar Manager
* 💬 ActionBar Manager
* 📦 Inventory API *(planned/in development)*
* 🛠️ Utility Classes
* 🔧 Easy-to-use API

More features will be added over time.

---

## Installation

### Maven

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>
```

```xml
<dependency>
    <groupId>com.github.RainbowFurry</groupId>
    <artifactId>Minecraft_Lib_API</artifactId>
    <version>VERSION</version>
</dependency>
```

### Gradle

```gradle
repositories {
    maven { url 'https://jitpack.io' }
}

dependencies {
    implementation 'com.github.RainbowFurry:Minecraft_Lib_API:VERSION'
}
```

---

## Example

### Scoreboard

```java
ScoreboardManager scoreboard = new ScoreboardManager();

scoreboard.create(player, "§6Lobby");
scoreboard.setLine(player, 3, "§7--------------");
scoreboard.setLine(player, 2, "§eCoins: §f150");
scoreboard.setLine(player, 1, "§aplay.example.net");
```

### BossBar

```java
BossBarManager bossBar = new BossBarManager();

bossBar.create(player, "Loading...", BarColor.GREEN, BarStyle.SOLID);
bossBar.setProgress(player, 0.75);
```

### ActionBar

```java
ActionBarManager actionBar = new ActionBarManager();

actionBar.send(player, "§aWelcome!");
```

---

## Requirements

* Java 21+
* Paper / Spigot
* Minecraft 1.21+

---

## Goals

The goal of this project is to provide a clean, reusable API for Minecraft plugin development without rewriting common systems for every project.

Instead of implementing scoreboards, boss bars, inventories, or utility classes repeatedly, developers can simply use this library.

---

## Planned Features

* [ ] Chat API
* [ ] Hologram API
* [ ] NPC API
* [ ] Database Utilities
* [ ] Configuration API
      
* [ ] Command Framework
* [ ] Placeholder Support
* [ ] Cooldown Manager

---

## Contributing

Contributions, bug reports and feature requests are welcome.

Feel free to open an Issue or submit a Pull Request.

---

## License

This project is licensed under the MIT License (or your chosen license).

---

Made with ❤️ by **RainbowFurry**
