package POO_Java_IV.repository;

public interface CRUDRepository<EntityType, IdType> {
    public void create(EntityType entity);
    public void update(IdType ID, EntityType entity);
    public void remove(IdType ID);
    public EntityType get(IdType ID);
}
