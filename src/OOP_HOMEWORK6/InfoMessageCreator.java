package OOP_HOMEWORK6;

public interface InfoMessageCreator<T> {
    public default String createInfoMessage(String preamble, T entity, String suffix){
        StringBuilder result = new StringBuilder();
        return result.append(preamble).append(entity.getClass().getSimpleName()).append(suffix).toString();
    }
}
