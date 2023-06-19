/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAgeRule extends AbstractModel{

    /**
    * Rule types: <li>all: effective for all files.</li> <li>file: effective for specified file suffixes.</li> <li>directory: effective for specified paths.</li> <li>path: effective for specified absolute paths.</li>
    */
    @SerializedName("MaxAgeType")
    @Expose
    private String MaxAgeType;

    /**
    * Content for each MaxAgeType: <li>For all, enter a wildcard *.</li> <li>For file, enter the suffix, e.g., jpg or txt.</li> <li>For directory, enter the path, e.g., /xxx/test/.</li> <li>For path, enter the absolute path, e.g., /xxx/test.html.</li> <b>Note: the all rule cannot be deleted, and it follows the origin site by default, which can be modified.</b>
    */
    @SerializedName("MaxAgeContents")
    @Expose
    private String [] MaxAgeContents;

    /**
    * Note: The value 0 means not to cache. <b>Note: The value 0 means not to cache.</b>
    */
    @SerializedName("MaxAgeTime")
    @Expose
    private Long MaxAgeTime;

    /**
    * Whether to follow the origin server. Valid values: on and off. If it's on, MaxAgeTime is ignored.
    */
    @SerializedName("FollowOrigin")
    @Expose
    private String FollowOrigin;

    /**
     * Get Rule types: <li>all: effective for all files.</li> <li>file: effective for specified file suffixes.</li> <li>directory: effective for specified paths.</li> <li>path: effective for specified absolute paths.</li> 
     * @return MaxAgeType Rule types: <li>all: effective for all files.</li> <li>file: effective for specified file suffixes.</li> <li>directory: effective for specified paths.</li> <li>path: effective for specified absolute paths.</li>
     */
    public String getMaxAgeType() {
        return this.MaxAgeType;
    }

    /**
     * Set Rule types: <li>all: effective for all files.</li> <li>file: effective for specified file suffixes.</li> <li>directory: effective for specified paths.</li> <li>path: effective for specified absolute paths.</li>
     * @param MaxAgeType Rule types: <li>all: effective for all files.</li> <li>file: effective for specified file suffixes.</li> <li>directory: effective for specified paths.</li> <li>path: effective for specified absolute paths.</li>
     */
    public void setMaxAgeType(String MaxAgeType) {
        this.MaxAgeType = MaxAgeType;
    }

    /**
     * Get Content for each MaxAgeType: <li>For all, enter a wildcard *.</li> <li>For file, enter the suffix, e.g., jpg or txt.</li> <li>For directory, enter the path, e.g., /xxx/test/.</li> <li>For path, enter the absolute path, e.g., /xxx/test.html.</li> <b>Note: the all rule cannot be deleted, and it follows the origin site by default, which can be modified.</b> 
     * @return MaxAgeContents Content for each MaxAgeType: <li>For all, enter a wildcard *.</li> <li>For file, enter the suffix, e.g., jpg or txt.</li> <li>For directory, enter the path, e.g., /xxx/test/.</li> <li>For path, enter the absolute path, e.g., /xxx/test.html.</li> <b>Note: the all rule cannot be deleted, and it follows the origin site by default, which can be modified.</b>
     */
    public String [] getMaxAgeContents() {
        return this.MaxAgeContents;
    }

    /**
     * Set Content for each MaxAgeType: <li>For all, enter a wildcard *.</li> <li>For file, enter the suffix, e.g., jpg or txt.</li> <li>For directory, enter the path, e.g., /xxx/test/.</li> <li>For path, enter the absolute path, e.g., /xxx/test.html.</li> <b>Note: the all rule cannot be deleted, and it follows the origin site by default, which can be modified.</b>
     * @param MaxAgeContents Content for each MaxAgeType: <li>For all, enter a wildcard *.</li> <li>For file, enter the suffix, e.g., jpg or txt.</li> <li>For directory, enter the path, e.g., /xxx/test/.</li> <li>For path, enter the absolute path, e.g., /xxx/test.html.</li> <b>Note: the all rule cannot be deleted, and it follows the origin site by default, which can be modified.</b>
     */
    public void setMaxAgeContents(String [] MaxAgeContents) {
        this.MaxAgeContents = MaxAgeContents;
    }

    /**
     * Get Note: The value 0 means not to cache. <b>Note: The value 0 means not to cache.</b> 
     * @return MaxAgeTime Note: The value 0 means not to cache. <b>Note: The value 0 means not to cache.</b>
     */
    public Long getMaxAgeTime() {
        return this.MaxAgeTime;
    }

    /**
     * Set Note: The value 0 means not to cache. <b>Note: The value 0 means not to cache.</b>
     * @param MaxAgeTime Note: The value 0 means not to cache. <b>Note: The value 0 means not to cache.</b>
     */
    public void setMaxAgeTime(Long MaxAgeTime) {
        this.MaxAgeTime = MaxAgeTime;
    }

    /**
     * Get Whether to follow the origin server. Valid values: on and off. If it's on, MaxAgeTime is ignored. 
     * @return FollowOrigin Whether to follow the origin server. Valid values: on and off. If it's on, MaxAgeTime is ignored.
     */
    public String getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set Whether to follow the origin server. Valid values: on and off. If it's on, MaxAgeTime is ignored.
     * @param FollowOrigin Whether to follow the origin server. Valid values: on and off. If it's on, MaxAgeTime is ignored.
     */
    public void setFollowOrigin(String FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    public MaxAgeRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxAgeRule(MaxAgeRule source) {
        if (source.MaxAgeType != null) {
            this.MaxAgeType = new String(source.MaxAgeType);
        }
        if (source.MaxAgeContents != null) {
            this.MaxAgeContents = new String[source.MaxAgeContents.length];
            for (int i = 0; i < source.MaxAgeContents.length; i++) {
                this.MaxAgeContents[i] = new String(source.MaxAgeContents[i]);
            }
        }
        if (source.MaxAgeTime != null) {
            this.MaxAgeTime = new Long(source.MaxAgeTime);
        }
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new String(source.FollowOrigin);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxAgeType", this.MaxAgeType);
        this.setParamArraySimple(map, prefix + "MaxAgeContents.", this.MaxAgeContents);
        this.setParamSimple(map, prefix + "MaxAgeTime", this.MaxAgeTime);
        this.setParamSimple(map, prefix + "FollowOrigin", this.FollowOrigin);

    }
}

