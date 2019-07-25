package com.example.inventario;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter{
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs)
    {
        super(fm);
        this.mNumOfTabs= NumOfTabs;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                FragmentBasico tab1 = new FragmentBasico();
                return  tab1;
            case 1:
                FragmentInformacion tab2 = new FragmentInformacion();
                return tab2;
            case 3:
                FragmentoFinal tab3 = new FragmentoFinal();
                return tab3;
        }
        return null;
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
