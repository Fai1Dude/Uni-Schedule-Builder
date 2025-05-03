# Uni-Schedule Builder 📅 (Java + JavaFX)

A desktop tool that helps **KFUPM students** build a clash-free schedule in minutes.  
It reads three CSV files — *Degree Plan*, *Finished Courses*, and *Course Offering* — then shows only the sections you’re allowed to take. Drag-and-drop (well, **click-add**) courses into a visual **7 am – 5 pm** grid, save the draft, and reload it next time.

> **Status:** proof-of-concept. Core models, prerequisite/​co-requisite checks, and a two-scene JavaFX UI work; polish & error-handling still needed.

---

## ✨ Why it’s useful
* **Filters instantly.** Sees your finished courses and degree plan, so it blocks anything you already passed or can’t yet take. :contentReference[oaicite:0]{index=0}  
* **Visual schedule grid.** Buttons numbered 0-54 become real slots (“ICS 108 del”) as you add a section. :contentReference[oaicite:1]{index=1}:contentReference[oaicite:2]{index=2}  
* **Save & reload.** The chosen `Schedule` object is serialized to `SavedSchedule.dat` for one-click continue later. :contentReference[oaicite:3]{index=3}:contentReference[oaicite:4]{index=4}  
* **Prereq / coreq logic.** `Student.canTake()` and `Schedule.coReqCheck()` enforce catalog rules. :contentReference[oaicite:5]{index=5}  

---

## 🗄️ Project layout

| Path | What it is |
|------|------------|
| `Course.java` | Course name, credit, pre-req & co-req strings |
| `Section.java` | One lecture/lab section, time/location/status | 
| `Student.java` | Holds finished courses + full degree plan |
| `Schedule.java` | A specific term’s basket + helper checks |
| `project (1).java` | **Main JavaFX app** (reads CSVs, builds UI) |
| `studentsIds.txt / sortedStudents.dat` | sample scratch files (not required) |

---

## ⚙️ Running locally

1. **Prerequisites**

   * Java 17+  
   * JavaFX 17 SDK on your class-path

2. **Compile & launch**

   ```bash
   javac --module-path <path-to-javafx-lib> --add-modules javafx.controls,javafx.fxml \
         com/example/*.java
   java  --module-path <path-to-javafx-lib> --add-modules javafx.controls,javafx.fxml \
         com.example.project

