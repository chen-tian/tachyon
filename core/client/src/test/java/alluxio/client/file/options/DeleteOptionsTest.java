/*
 * The Alluxio Open Foundation licenses this work under the Apache License, version 2.0
 * (the “License”). You may not use this work except in compliance with the License, which is
 * available at www.apache.org/licenses/LICENSE-2.0
 *
 * This software is distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied, as more fully set forth in the License.
 *
 * See the NOTICE file distributed with this work for information regarding copyright ownership.
 */

package alluxio.client.file.options;

import alluxio.CommonTestUtils;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Tests for the {@link DeleteOptions} class.
 */
public class DeleteOptionsTest {
  /**
   * Tests that building a {@link DeleteOptions} with the defaults works.
   */
  @Test
  public void defaultsTest() {
    DeleteOptions options = DeleteOptions.defaults();

    Assert.assertFalse(options.isRecursive());
  }

  /**
   * Tests getting and setting fields.
   */
  @Test
  public void fieldsTest() {
    Random random = new Random();
    boolean recursive = random.nextBoolean();
    DeleteOptions options = DeleteOptions.defaults();

    options.setRecursive(recursive);

    Assert.assertEquals(recursive, options.isRecursive());
  }

  @Test
  public void equalsTest() throws Exception {
    CommonTestUtils.testEquals(DeleteOptions.class);
  }
}
