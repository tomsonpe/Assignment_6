package com.ddd.assignment_6;

import com.ddd.assignment_6.FactoryTest.TestCash;
import com.ddd.assignment_6.FactoryTest.TestVideo;
import com.ddd.assignment_6.FactoryTest.TestVideoEditor;
import com.ddd.assignment_6.FactoryTest.TestWedding;
import com.ddd.assignment_6.FactoryTest.TestCheque;
import com.ddd.assignment_6.FactoryTest.TestCredit;
import com.ddd.assignment_6.FactoryTest.TestFunerals;
import com.ddd.assignment_6.FactoryTest.TestGraduation;
import com.ddd.assignment_6.FactoryTest.TestPhoto;
import com.ddd.assignment_6.FactoryTest.TestPhotoEditor;
import com.ddd.assignment_6.FactoryTest.TestReligion;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * Created by 214162966 on 4/17/2016.
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestCash.class,
        TestVideo.class,
        TestVideoEditor.class,
        TestWedding.class,
        TestCheque.class,
        TestCredit.class,
        TestFunerals.class,
        TestPhoto.class,
        TestPhotoEditor.class,
        TestReligion.class})
class ApplicationTestSuit {
}
