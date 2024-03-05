package br.clayder.finansys.invoice.domain

abstract class AggregateRoot<ID: Identifier>(id: ID) : Entity<ID>(id) {
}
