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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAgeRule extends AbstractModel{

    /**
    * Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: effective for specified homepages.
    */
    @SerializedName("MaxAgeType")
    @Expose
    private String MaxAgeType;

    /**
    * Content for each `MaxAgeType`:
For `all`, enter a wildcard `*`.
For `file`, enter the suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, e.g., `/xxx/test/`.
For `path`, enter the absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
    */
    @SerializedName("MaxAgeContents")
    @Expose
    private String [] MaxAgeContents;

    /**
    * MaxAge time (in seconds)
    */
    @SerializedName("MaxAgeTime")
    @Expose
    private Long MaxAgeTime;

    /**
    * 
    */
    @SerializedName("FollowOrigin")
    @Expose
    private String FollowOrigin;

    /**
     * Get Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: effective for specified homepages. 
     * @return MaxAgeType Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: effective for specified homepages.
     */
    public String getMaxAgeType() {
        return this.MaxAgeType;
    }

    /**
     * Set Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: effective for specified homepages.
     * @param MaxAgeType Rule types:
`all`: effective for all files.
`file`: effective for specified file suffixes.
`directory`: effective for specified paths.
`path`: effective for specified absolute paths.
`index`: effective for specified homepages.
     */
    public void setMaxAgeType(String MaxAgeType) {
        this.MaxAgeType = MaxAgeType;
    }

    /**
     * Get Content for each `MaxAgeType`:
For `all`, enter a wildcard `*`.
For `file`, enter the suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, e.g., `/xxx/test/`.
For `path`, enter the absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`. 
     * @return MaxAgeContents Content for each `MaxAgeType`:
For `all`, enter a wildcard `*`.
For `file`, enter the suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, e.g., `/xxx/test/`.
For `path`, enter the absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
     */
    public String [] getMaxAgeContents() {
        return this.MaxAgeContents;
    }

    /**
     * Set Content for each `MaxAgeType`:
For `all`, enter a wildcard `*`.
For `file`, enter the suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, e.g., `/xxx/test/`.
For `path`, enter the absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
     * @param MaxAgeContents Content for each `MaxAgeType`:
For `all`, enter a wildcard `*`.
For `file`, enter the suffix, e.g., `jpg` or `txt`.
For `directory`, enter the path, e.g., `/xxx/test/`.
For `path`, enter the absolute path, e.g., `/xxx/test.html`.
For `index`, enter a forward slash `/`.
     */
    public void setMaxAgeContents(String [] MaxAgeContents) {
        this.MaxAgeContents = MaxAgeContents;
    }

    /**
     * Get MaxAge time (in seconds) 
     * @return MaxAgeTime MaxAge time (in seconds)
     */
    public Long getMaxAgeTime() {
        return this.MaxAgeTime;
    }

    /**
     * Set MaxAge time (in seconds)
     * @param MaxAgeTime MaxAge time (in seconds)
     */
    public void setMaxAgeTime(Long MaxAgeTime) {
        this.MaxAgeTime = MaxAgeTime;
    }

    /**
     * Get  
     * @return FollowOrigin 
     */
    public String getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set 
     * @param FollowOrigin 
     */
    public void setFollowOrigin(String FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
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

