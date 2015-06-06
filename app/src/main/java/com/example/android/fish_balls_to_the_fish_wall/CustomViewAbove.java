//package com.example.android.fish_balls_to_the_fish_wall;

package com.example.android.fish_balls_to_the_fish_wall;

import java.util.ArrayList;
import java,util.List;

import android.contact.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.v4.view.KeyEventCompact;
import android.support.v4.view.MotionEventCompact;
import android.support.v4.view.ViewCompact;
import android.support.v4.view.ViewConfigurationCompact;
import android.util.AttributeSet;
import android.util.FloatMath;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyFinder;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;

import com.example.android.fish_balls_to_the_fish_wall.SlidingMenu.OnClosedListener;
import com.example.android.fish_balls_to_the_fish_wall.SlidingMenu.OnOpenedListener;

public class CustomViewAbove extends ViewGroup {

    private static final String TAG = "CustomViewAbove";
    private static final boolean DEBUG = false;

    private static final boolean USE_CACHE = false;

    private static final int MAX_SETTLE_DURATION  = 600; //ms
    private static final int MIN_DISTANCE_FOR_FLING = 25; //dips

    private static final Interpolator sInterpolator = new Interpolator() {
        public float getInterpolation(float t) {
            t -= 1.0f;
            return t * t * t * t * t + 1.0f;
        }
    };

    private View mContent;

    private int mCurItem;
    private Scroller mScroller;

    private boolean mScrollingCacheEnabled;

    private boolean mScrolling;

    private boolean mIsBeingDragged;
    private boolean mIsUnableToDrag;
    private int mTouchSlop;
    private float mInitialMotionX;
    /**
     * Position of the last motion event.
     */
    private float mLastMotionX;
    private float mLastMotionY;
    /**
     * ID of the active pointer. This is used to retain consistency during
     * drags/flings if multiple pointers are used.
     */
    protected int mActivePointerId = INVALID_POINTER;
    /**
     * Sentinel value for no current active pointer.
     * Used by {@link #mActivePointerId}.
     */
    private static final int INVALID_POINTER = -1;

    /**
     * Determines speed during touch scrolling
     */
    protected VelocityTracker mVelocityTracker;
    private int mMinimumVelocity;
    protected int mMaximumVelocity;
    private int mFlingDistance;

    private CustomViewBehind mViewBehind;
    // private int mMode;
    private boolean mEnabled = true;

    private OnPageChangeListener mOnPageChangeListener;
    private OnPageChangeListener mInternalPageChangeListener;

    //private onCloseListener mCloseListener;
    //private onOpenListener mOpenListener;
    private OnClosedListener mClosedListener;
    private OnOpenedListener mOpenedListener;

    private List<View> mIgnoredViews = new ArrayList<View>();

    //private int mScrollState = SCROLL_STATE_IDLE;

    /**
     * Callback interface for reponding to changing state of the selected page.
     */
    
}