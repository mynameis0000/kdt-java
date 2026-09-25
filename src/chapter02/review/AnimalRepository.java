package chapter02.review;

import java.util.HashMap;
import java.util.Map;

public class AnimalRepository {
    // 저장소: Key는 Long(기본 키 ID), Value는 Animal 객체
    private final Map<Long, Animal> store = new HashMap<>();

    // ID 자동 생성 카운터 (Long 타입의 0을 뜻하는 0L)
    private Long sequence = 0L;

    Animal save(Animal animal) {
        sequence = sequence + 1; // ID 1 증가 (또는 sequence++)
        animal.assignId(sequence);
        store.put(sequence, animal);
        return animal;
    }

    Animal findById(Long id) {
        // Map은 존재하지 않는 키를 조회하면 자동으로 null을 반환합니다.
        return store.get(id);
    }
}