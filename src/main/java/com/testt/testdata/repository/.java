@Repository
public interface ExecutiveMemoRepo extends JpaRepository<ExecutiveMemo, Long> {
    
    List<ExecutiveMemo> findByMemoNotNull();

    List<ExecutiveMemo> findByDateCreatedNotNull();

    List<ExecutiveMemo> findByDowNotNull();

    ExecutiveMemo findByMemoAndDateCreatedAndDow(String memo, Date dateCreated, int dow);

    @Query("select e from ExecutiveMemo e where e.memo is not null")
    List<ExecutiveMemo> findAllValidMemos();

    @Query("select e from ExecutiveMemo e where e.dateCreated is not null")
    List<ExecutiveMemo> findAllValidDateCreated();

    @Query("select e from ExecutiveMemo e where e.dow is not null")
    List<ExecutiveMemo> findAllValidDow();

    @Query("select e from ExecutiveMemo e where e.memo is not null and e.dateCreated is not null and e.dow is not null")
    List<ExecutiveMemo> findAllValidData();

    @Modifying
    @Query("delete from ExecutiveMemo e where e.memo = :memo")
    void deleteByMemo(@Param("memo") String memo);

}