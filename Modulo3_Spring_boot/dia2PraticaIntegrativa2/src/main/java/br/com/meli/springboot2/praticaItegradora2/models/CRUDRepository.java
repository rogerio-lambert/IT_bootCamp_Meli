package br.com.meli.springboot2.praticaItegradora2.models;

public interface CRUDRepository<EntityType, IdType> {
    public void create(EntityType entity);
    public void update(IdType ID, EntityType entity);
    public void remove(IdType ID);
    public EntityType get(IdType ID);
}
