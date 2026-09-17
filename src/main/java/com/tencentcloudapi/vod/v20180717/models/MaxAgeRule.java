/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAgeRule extends AbstractModel {

    /**
    * <p>Rule type:</p><li>all: takes effect for all files;</li><li>file: takes effect for a specified file suffix;</li><li>directory: takes effect for a specified path;</li><li>path: takes effect for an absolute path.</li>
    */
    @SerializedName("MaxAgeType")
    @Expose
    private String MaxAgeType;

    /**
    * <p>Match content for the corresponding MaxAgeType:</p><li>For all, fill in *;</li><li>For file, fill in the extension, such as jpg, txt;</li><li>For directory, fill in the path, such as /xxx/test/;</li><li>For path, fill in the absolute path, such as /xxx/test.html.</li><b>Note: The all rule is non-deletable, follows the origin site by default, and is modifiable.</b>
    */
    @SerializedName("MaxAgeContents")
    @Expose
    private String [] MaxAgeContents;

    /**
    * <p>MaxAge time setting, in seconds; <br><b>Note: A time of 0 means no cache.</b></p>
    */
    @SerializedName("MaxAgeTime")
    @Expose
    private Long MaxAgeTime;

    /**
    * <p>Whether to follow the origin site. Valid values: on, off. When enabled, ignore timing.</p>
    */
    @SerializedName("FollowOrigin")
    @Expose
    private String FollowOrigin;

    /**
     * Get <p>Rule type:</p><li>all: takes effect for all files;</li><li>file: takes effect for a specified file suffix;</li><li>directory: takes effect for a specified path;</li><li>path: takes effect for an absolute path.</li> 
     * @return MaxAgeType <p>Rule type:</p><li>all: takes effect for all files;</li><li>file: takes effect for a specified file suffix;</li><li>directory: takes effect for a specified path;</li><li>path: takes effect for an absolute path.</li>
     */
    public String getMaxAgeType() {
        return this.MaxAgeType;
    }

    /**
     * Set <p>Rule type:</p><li>all: takes effect for all files;</li><li>file: takes effect for a specified file suffix;</li><li>directory: takes effect for a specified path;</li><li>path: takes effect for an absolute path.</li>
     * @param MaxAgeType <p>Rule type:</p><li>all: takes effect for all files;</li><li>file: takes effect for a specified file suffix;</li><li>directory: takes effect for a specified path;</li><li>path: takes effect for an absolute path.</li>
     */
    public void setMaxAgeType(String MaxAgeType) {
        this.MaxAgeType = MaxAgeType;
    }

    /**
     * Get <p>Match content for the corresponding MaxAgeType:</p><li>For all, fill in *;</li><li>For file, fill in the extension, such as jpg, txt;</li><li>For directory, fill in the path, such as /xxx/test/;</li><li>For path, fill in the absolute path, such as /xxx/test.html.</li><b>Note: The all rule is non-deletable, follows the origin site by default, and is modifiable.</b> 
     * @return MaxAgeContents <p>Match content for the corresponding MaxAgeType:</p><li>For all, fill in *;</li><li>For file, fill in the extension, such as jpg, txt;</li><li>For directory, fill in the path, such as /xxx/test/;</li><li>For path, fill in the absolute path, such as /xxx/test.html.</li><b>Note: The all rule is non-deletable, follows the origin site by default, and is modifiable.</b>
     */
    public String [] getMaxAgeContents() {
        return this.MaxAgeContents;
    }

    /**
     * Set <p>Match content for the corresponding MaxAgeType:</p><li>For all, fill in *;</li><li>For file, fill in the extension, such as jpg, txt;</li><li>For directory, fill in the path, such as /xxx/test/;</li><li>For path, fill in the absolute path, such as /xxx/test.html.</li><b>Note: The all rule is non-deletable, follows the origin site by default, and is modifiable.</b>
     * @param MaxAgeContents <p>Match content for the corresponding MaxAgeType:</p><li>For all, fill in *;</li><li>For file, fill in the extension, such as jpg, txt;</li><li>For directory, fill in the path, such as /xxx/test/;</li><li>For path, fill in the absolute path, such as /xxx/test.html.</li><b>Note: The all rule is non-deletable, follows the origin site by default, and is modifiable.</b>
     */
    public void setMaxAgeContents(String [] MaxAgeContents) {
        this.MaxAgeContents = MaxAgeContents;
    }

    /**
     * Get <p>MaxAge time setting, in seconds; <br><b>Note: A time of 0 means no cache.</b></p> 
     * @return MaxAgeTime <p>MaxAge time setting, in seconds; <br><b>Note: A time of 0 means no cache.</b></p>
     */
    public Long getMaxAgeTime() {
        return this.MaxAgeTime;
    }

    /**
     * Set <p>MaxAge time setting, in seconds; <br><b>Note: A time of 0 means no cache.</b></p>
     * @param MaxAgeTime <p>MaxAge time setting, in seconds; <br><b>Note: A time of 0 means no cache.</b></p>
     */
    public void setMaxAgeTime(Long MaxAgeTime) {
        this.MaxAgeTime = MaxAgeTime;
    }

    /**
     * Get <p>Whether to follow the origin site. Valid values: on, off. When enabled, ignore timing.</p> 
     * @return FollowOrigin <p>Whether to follow the origin site. Valid values: on, off. When enabled, ignore timing.</p>
     */
    public String getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set <p>Whether to follow the origin site. Valid values: on, off. When enabled, ignore timing.</p>
     * @param FollowOrigin <p>Whether to follow the origin site. Valid values: on, off. When enabled, ignore timing.</p>
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

