# v1.7.1 (2020-07-13)
Fixes:
 * Context menu no longer closes when clicking somewhere outside of it.

# v1.7.0 (2020-07-12)
Features:
 * Added a configuration button (looks like a cog) to the "Object Panel". Opens up a configuration popup.
 * Holding the Shift key will increase a panning speed when moving with arrow keys.
 * Added a preference to enable an alternative, "DM-like", scroll behavior.
 * Environment tree will display the number of currently filtered objects.
 * Added "Crimson Moon" color schema.

Fixes:
 * Subtypes without a different name from it's parent had the wrong name.

Tweaks:
 * Added a changing of the mouse cursor while holding the Space key to show the panning mode is changed.
 * In "Select" mode, when nothing is selected, tile under the mouse will be copied.
 * SpacemanDMM parser updated to version 1.5.0.
 * Reduced CPU usage for environment tree filtering.
 * Enlarged preferences window.
 * Improved changelog window markdown.

# v1.6.0 (2020-06-27)
Features:
 * Added support for UI scaling! Interface could be scaled from "Preferences" window.
 * Added switchable interface themes.
 * Added "Synchronize Maps View" option. When enabled all maps will share the same "camera" location. Helpful for multi-z maps with levels per-file.
 * "Edit Variables" window now has a "Reset Variable To Default" button for modified variables.
 * Added advanced "Unknown Types Replacer" tool. Works in the same way DM does. You open a map with unknown type - you are able to replace those types with something else. Tool also has a feature to modify objects variables as well.

Fixes:
 * Inability to switch between maps with the same name.

Tweaks:
 * "Show Modified Variables" toggle state won't be reset between "Edit Variables" windows.

# v1.5.0 (2020-05-26)
Features:
 * Added a fullscreen mode! Use "Window->Fullscreen" or F11 hotkey to toggle.

Fixes:
 * Incorrect window maximization on start. The window will cover the screen correctly.

# v1.4.0 (2020-05-24)
Features:
 * New appearance!
 * Added an option to sort variables by their type in the Edit Variables window.
 * Environment panel will show recent maps. Thus you can directly open the map in the corresponding environment.
 * Added a hotkey (F5) to Reset Windows state (initial sizes and position).

Tweaks:
 * Modified map will be highlighted with a color instead of the asterisk.
 * Variables preview window will collapse when the instance has initial variables.

# v1.3.1 (2020-05-20)
Fixes:
 * Nasty crashes when copy-pasting anything into the "Edit Variables" window.
 * Impropper rendering of the typed russian letters in the "Edit Variables" window.
 * Saving logs to a file.

# v1.3.0 (2020-05-12)
Features:
 * Item selection will open the item in the environment tree.
 * Added shortcuts to do a zoom-in/zoom-out with keyboard buttons plus and minus.
 * Added canvas panning with arrow keys.

Fixes:
 * Reset marked tile after closing of the search result panel.

# v1.2.0 (2020-05-10)
Features:
 * Added an option to pin variables in "Edit Variables" window.
 * Added "Screenshot" tool to create high-resolution map images.
   Screenshot could be made for the map or just a selected area.
   It's available from the menu bar: "Options->Screenshot...".

Fixes:
 * Crush when editing variables.

Tweaks:
 * The editor now has its own logo! It was designed by Clément "Topy", thank him for that.
 * Allowed for turfs to change their dir from the tile popup menu.
 * "Preferences" button moved under the "File" menu item.
 * When trying to change the environment, if there are changes on the map, you will be asked to save them.

# v1.1.0 (2020-04-18)
Features:
 * Added a built-in changelog. Auto-shown when updated. Could be opened with: "Help->Changelog...".
 * When creating a new map, "dmm" extension will be added automatically.
 * "Show Icons" checkbox for "Environment Tree" replaced with "Collapse All" button.
 * Added a tile popup widget for quick dir modification.

Fixes:
 * The old bug which was the reason for map corruptions.

Tweaks:
 * Removed "movable" options for turfs and areas.
 * Editor title will show the name of the currently opened environment.
