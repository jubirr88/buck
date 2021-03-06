/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.apple;

import org.immutables.value.Value;

import java.nio.file.Path;

/**
 * Paths to Apple SDK directories under an installation of Xcode.
 */
@Value.Immutable
public interface AppleSdkPaths {
  /**
   * Absolute path to tools and files independent of the platform.
   *
   * Example:
   *
   * {@code /Applications/Xcode.app/Contents/Developer/Toolchains/XcodeDefault.xctoolchain}
   */
  Path toolchainPath();

  /**
   * Absolute path to tools and files which depend on a particular platform.
   *
   * Example:
   *
   * {@code /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Developer}
   */
  Path platformDeveloperPath();

  /**
   * Absolute path to tools and files which depend on a particular SDK on a particular platform.
   *
   * Example:
   *
   * {@code /Applications/Xcode.app/Contents/Developer/Platforms/iPhoneSimulator.platform/Developer/SDKs/iPhoneSimulator8.0.sdk}
   */
  Path sdkPath();
}
