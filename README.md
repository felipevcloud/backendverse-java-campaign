# Backendverse Java Campaign

A practical path from Java fundamentals to junior backend development, built around explicit teaching, executable code, technical review and progressively independent projects.

The campaign starts with **Head First Java / Use a Cabeça Java, 3rd edition**, completes the modern Java foundations needed by backend work and continues through Maven, testing, Git, JSON, SQL, JDBC, HTTP, REST, Spring Boot, persistence, security and delivery.

---

## Current Campaign State

| Item | Current state |
|---|---|
| Official methodology | Backendverse Playbook v1.5 — final |
| Official curriculum | Backendverse Curriculum v1.5 |
| Current arc | Saga VI — A Ponte para o Backend |
| Last approved mission | Episode 18 — Os Pergaminhos JSON e o Git da Guilda |
| Next mission | Revisit 18 — A Oficina do Git |
| Boss Battles completed | 5 |

Episodes 01–18 and Boss Battles I–V remain approved. The Revisit 18 is a focused consolidation mission: JSON stays closed, while Git is rebuilt progressively from the essential local workflow through remotes, branches, integration, conflicts and Pull Requests. The checkpoint follows after Git can be driven from repository state instead of a copied command sequence.

---

## Final Methodology — v1.5

The learning loop is:

```text
teach → demonstrate → build together → build independently → execute → review → revisit
```

Important rules:

- every mission is fully planned in the Curriculum before it begins;
- new syntax and APIs are taught before they are required;
- short content/action microcycles replace interrogations;
- the complete Mastery Map appears at mission start and block boundaries;
- every operational Episode ends with a planned, independent mini-boss;
- the final harness reproduces essential evidence in one clear run;
- discussion and code recognition do not replace implementation;
- documentation and Git administration wait until mission closure.

The Sensei provides infrastructure that is not being assessed—such as a `main`, fixtures or boilerplate—while the learner writes, runs and explains the pedagogical core.

Lessons run in normal Chat inside a Project. The repository `main` branch is the only operational public source. Project Instructions only bootstrap the Sensei; private learner context stores stable preferences, never campaign state.

---

## Main Files

- [`PLAYBOOK.md`](PLAYBOOK.md): teaching, evidence, interaction and persistence rules.
- [`CURRICULUM.md`](CURRICULUM.md): complete roadmap, mandatory coverage, block plans and mastery requirements.
- [`CAMPAIGN.md`](CAMPAIGN.md): short rolling snapshot of the current official state.

Git history preserves earlier states; `CAMPAIGN.md` is not used as a conversation diary.

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
├── Saga04_O_Arsenal_Do_Desenvolvedor/
├── Saga05_O_Fluxo_E_O_Caos_controlado/
└── Saga06_A_Ponte_Para_O_Backend/
    ├── Episode15_O_Ritual_Maven/
    ├── Episode16_A_Forja_Das_Dependencias/
    ├── Episode17_O_Tribunal_Dos_Testes/
    └── Episode18_Os_Pergaminhos_JSON_E_O_Git_Da_Guilda/
```

A mission receives a directory only after it produces an executable or otherwise repository-worthy artifact. Empty Episode or Revisit folders are not created in advance.

---

## Junior Backend Exit Profile

The completed campaign requires evidence of:

- independent Java and object-oriented modeling;
- Collections, generics, exceptions, functional Java and modern value types;
- Maven, Git, JSON and automated testing;
- SQL, PostgreSQL, JDBC, transactions, indexes and migrations;
- HTTP, REST and API contract design;
- Spring Boot, layered architecture and JPA;
- DTOs, validation, global errors, pagination and OpenAPI;
- authentication and authorization;
- Mockito, Testcontainers and integration testing;
- external configuration, logs and health checks;
- Docker, CI and a reproducible deployment;
- explanation and defense of technical decisions.

Advanced concurrency, messaging, distributed cache, microservices, Kubernetes and cloud-specific architecture remain explicit post-graduation arcs. The goal here is not to collect buzzwords—it is to build, run, debug, ship and understand a solid junior backend system.
