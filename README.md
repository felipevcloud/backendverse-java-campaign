# Backendverse Java Campaign

A structured path from Java fundamentals to backend development, built around executable practice, technical review and progressively independent projects.

The campaign begins with **Head First Java / Use a Cabeça Java, 3rd edition** and continues through Maven, automated testing, Git, JSON, SQL, JDBC, HTTP, REST, Spring Boot, persistence and professional API design.

---

## Current Campaign State

| Item | Current state |
|---|---|
| Official methodology | Backendverse Playbook v1.4 |
| Current Saga | Saga V — O Fluxo e o Caos Controlado |
| Current mission | None |
| Last verified mission | Boss Battle IV — O Arquivo do Mundo Digital |
| Next mission | Episode 12 — A Respiração dos Fluxos |
| Boss Battles completed | 4 |

An audit requested by the learner found that the previous completions of Episodes 12 and 13 relied too heavily on verbal reasoning and small snippets without sufficient independent executable evidence. Those approvals were withdrawn, and the Boss Battle V attempt was cancelled before producing an artifact.

Episodes 01–11 and Boss Battles I–IV remain fully preserved. The next step is a new Episode 12 under Playbook v1.4.

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

Lessons run primarily in a normal Chat inside the campaign Project. Work mode is reserved for tasks that actually need tools: inspecting code, compiling, testing, maintaining documentation and synchronizing the repository.

---

## Main Files

### [`PLAYBOOK.md`](PLAYBOOK.md)

The operational teaching and assessment rules.

### [`CURRICULUM.md`](CURRICULUM.md)

The complete roadmap, mission content and mastery requirements.

### [`CAMPAIGN.md`](CAMPAIGN.md)

The current official state, completed milestones, audit record and next mission.

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
