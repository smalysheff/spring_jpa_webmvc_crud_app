package ru.smal.service;

import java.util.List;

public interface EntityService<Entity, Key> {
    Entity getById(Key key);

    List<Entity> findAll();

    Entity save(Entity entity);

    Entity update(Entity entity);

    void deleteById(Key key);
}
