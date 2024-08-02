package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {

    void add(SetmealDTO setmealDTO);

    PageResult pageQuery(SetmealPageQueryDTO pageQueryDTO);

    void deleteBatch(List<Long> ids);

    void updateWithDish(SetmealDTO setmealDTO);

    SetmealVO getById(Long id);

    void startOrStop(Long id, Integer status);
}
