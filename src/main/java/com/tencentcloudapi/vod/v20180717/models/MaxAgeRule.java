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
    * Rule type: <li>all: valid for all files;</li> <li>file: valid for specified file suffix;</li> <li>directory: valid for specified path;</li> <li>path: specified absolute The path takes effect. </li>
    */
    @SerializedName("MaxAgeType")
    @Expose
    private String MaxAgeType;

    /**
    * Matching content under the corresponding type of MaxAgeType: <li>Fill in * when all is used; </li> <li> Fill in suffix name when file is used, such as jpg, txt; </li> <li> Fill in path when directory is used, such as /xxx/ test/;</li> <li>Fill in the absolute path when path is specified, such as /xxx/test.html. </li> <b>Note: all rules cannot be deleted. They follow the origin site by default and can be modified. </b>
    */
    @SerializedName("MaxAgeContents")
    @Expose
    private String [] MaxAgeContents;

    /**
    * MaxAge time setting, unit second; <b>Note: The time is 0, which means no caching. </b>
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
     * Get Rule type: <li>all: valid for all files;</li> <li>file: valid for specified file suffix;</li> <li>directory: valid for specified path;</li> <li>path: specified absolute The path takes effect. </li> 
     * @return MaxAgeType Rule type: <li>all: valid for all files;</li> <li>file: valid for specified file suffix;</li> <li>directory: valid for specified path;</li> <li>path: specified absolute The path takes effect. </li>
     */
    public String getMaxAgeType() {
        return this.MaxAgeType;
    }

    /**
     * Set Rule type: <li>all: valid for all files;</li> <li>file: valid for specified file suffix;</li> <li>directory: valid for specified path;</li> <li>path: specified absolute The path takes effect. </li>
     * @param MaxAgeType Rule type: <li>all: valid for all files;</li> <li>file: valid for specified file suffix;</li> <li>directory: valid for specified path;</li> <li>path: specified absolute The path takes effect. </li>
     */
    public void setMaxAgeType(String MaxAgeType) {
        this.MaxAgeType = MaxAgeType;
    }

    /**
     * Get Matching content under the corresponding type of MaxAgeType: <li>Fill in * when all is used; </li> <li> Fill in suffix name when file is used, such as jpg, txt; </li> <li> Fill in path when directory is used, such as /xxx/ test/;</li> <li>Fill in the absolute path when path is specified, such as /xxx/test.html. </li> <b>Note: all rules cannot be deleted. They follow the origin site by default and can be modified. </b> 
     * @return MaxAgeContents Matching content under the corresponding type of MaxAgeType: <li>Fill in * when all is used; </li> <li> Fill in suffix name when file is used, such as jpg, txt; </li> <li> Fill in path when directory is used, such as /xxx/ test/;</li> <li>Fill in the absolute path when path is specified, such as /xxx/test.html. </li> <b>Note: all rules cannot be deleted. They follow the origin site by default and can be modified. </b>
     */
    public String [] getMaxAgeContents() {
        return this.MaxAgeContents;
    }

    /**
     * Set Matching content under the corresponding type of MaxAgeType: <li>Fill in * when all is used; </li> <li> Fill in suffix name when file is used, such as jpg, txt; </li> <li> Fill in path when directory is used, such as /xxx/ test/;</li> <li>Fill in the absolute path when path is specified, such as /xxx/test.html. </li> <b>Note: all rules cannot be deleted. They follow the origin site by default and can be modified. </b>
     * @param MaxAgeContents Matching content under the corresponding type of MaxAgeType: <li>Fill in * when all is used; </li> <li> Fill in suffix name when file is used, such as jpg, txt; </li> <li> Fill in path when directory is used, such as /xxx/ test/;</li> <li>Fill in the absolute path when path is specified, such as /xxx/test.html. </li> <b>Note: all rules cannot be deleted. They follow the origin site by default and can be modified. </b>
     */
    public void setMaxAgeContents(String [] MaxAgeContents) {
        this.MaxAgeContents = MaxAgeContents;
    }

    /**
     * Get MaxAge time setting, unit second; <b>Note: The time is 0, which means no caching. </b> 
     * @return MaxAgeTime MaxAge time setting, unit second; <b>Note: The time is 0, which means no caching. </b>
     */
    public Long getMaxAgeTime() {
        return this.MaxAgeTime;
    }

    /**
     * Set MaxAge time setting, unit second; <b>Note: The time is 0, which means no caching. </b>
     * @param MaxAgeTime MaxAge time setting, unit second; <b>Note: The time is 0, which means no caching. </b>
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

