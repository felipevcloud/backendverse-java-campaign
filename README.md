# Backendverse Java Campaign

A structured path from Java fundamentals to backend development, built around executable practice, technical review and progressively independent projects.

The campaign begins with **Head First Java / Use a Cabeça Java, 3rd edition** and continues through Maven, automated testing, Git, JSON, SQL, JDBC, HTTP, REST, Spring Boot, persistence and professional API design.

---

## Current Campaign State

| Item | Current state |
|---|---|
| Official methodology | Backendverse Playbook v1.4 |
| Current arc | Saga V — O Fluxo e o Caos Controlado |
| Last major verified milestone | Boss Battle IV — O Arquivo do Mundo Digital |
| v1.4 restart point | Episode 12 — A Respiração dos Fluxos |
| Boss Battles completed | 4 |

An audit requested by the learner found that the previous completions of Episodes 12 and 13 relied too heavily on verbal reasoning and small snippets without sufficient independent executable evidence. Those approvals were withdrawn, and the Boss Battle V attempt was cancelled before producing an artifact.

Episodes 01–11 and Boss Battles I–IV remain fully preserved. Progress under Playbook v1.4 resumes from Episode 12.

---

## What Changed in v1.4

The campaign now follows a simpler learning sequence:

```text
Teach
→ Demonstrate
→ Build together
→ Build independently
→ Execute
→ Review
→ Revisit later
```

For operational programming skills, discussion or code recognition alone is not mastery. Approval requires independent code, compilation, execution and inspection.

Every mission receives a visible plan before it begins, normally containing two to four substantial blocks with explicit deliverables and stopping points. Boss Battles only integrate content that has already been implemented during previous Episodes.

Lessons run in a normal Chat inside a Project with project-only memory. The learner writes and runs code in IntelliJ and controls commits and pushes. The Sensei teaches, reviews shared evidence and provides precise patches or commands; external operations happen only when explicitly requested.

The repository's `main` branch is the single operational source of truth. New mission chats read the current Playbook, Curriculum section and Campaign state from GitHub instead of relying on static copies uploaded to the Project.

---

## Main Files

### [`PLAYBOOK.md`](PLAYBOOK.md)

The operational teaching and assessment rules.

### [`CURRICULUM.md`](CURRICULUM.md)

The complete roadmap, mission content and mastery requirements.

### [`CAMPAIGN.md`](CAMPAIGN.md)

A short rolling snapshot of the current official state and latest verified evidence. Git history preserves previous snapshots.

---

## Repository Structure

```text
backendverse-java-campaign/
├── PLAYBOOK.md
├── CURRICULUM.md
├── CAMPAIGN.md
├── README.md
├── Saga01_O_Despertar_Do_Codigo/
├── Saga02_O_Caminho_Das_Tecnicas/
├── Saga03_O_Legado_Dos_Objetos/
└── Saga04_O_Arsenal_Do_Desenvolvedor/
```

A mission receives a directory only when it produces an executable or otherwise repository-worthy artifact. The validated artifact tree currently ends with Boss Battle IV.

---

## Final Goal

By the end of the campaign, I aim to be able to:

- understand and model software problems;
- write clean, tested Java code independently;
- work with relational databases;
- build REST APIs with Spring Boot;
- use Git and professional build tools;
- explain and defend technical decisions;
- maintain a coherent backend development portfolio.

The goal is not to look like I understand code. The goal is to build it, run it, debug it and know why it works.
