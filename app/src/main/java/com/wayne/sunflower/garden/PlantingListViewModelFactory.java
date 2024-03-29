package com.wayne.sunflower.garden;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

import com.wayne.sunflower.data.PlantingRepository;

public class PlantingListViewModelFactory extends ViewModelProvider.NewInstanceFactory {

    private PlantingRepository mPlantingRepository;

    public PlantingListViewModelFactory(PlantingRepository plantingRepository) {
        super();
        mPlantingRepository = plantingRepository;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new PlantingListViewModel(mPlantingRepository);
    }
}
