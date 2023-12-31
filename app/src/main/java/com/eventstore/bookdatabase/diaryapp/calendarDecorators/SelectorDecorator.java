package com.eventstore.bookdatabase.diaryapp.calendarDecorators;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.eventstore.bookdatabase.diaryapp.R;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;

public class SelectorDecorator implements DayViewDecorator {

    private final Drawable drawable;

    public SelectorDecorator(Context context){
        drawable = ContextCompat.getDrawable(context, R.drawable.calendar_selector);
    }
    @Override
    public boolean shouldDecorate(CalendarDay calendarDay) {
        return true;
    }

    @Override
    public void decorate(DayViewFacade view) {
        view.setSelectionDrawable(drawable);
    }
}
