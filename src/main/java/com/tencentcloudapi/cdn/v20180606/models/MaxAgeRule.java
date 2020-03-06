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
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
    */
    @SerializedName("MaxAgeType")
    @Expose
    private String MaxAgeType;

    /**
    * Matching content under the corresponding types for MaxAgeType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
    */
    @SerializedName("MaxAgeContents")
    @Expose
    private String [] MaxAgeContents;

    /**
    * MaxAge time settings (in seconds)
    */
    @SerializedName("MaxAgeTime")
    @Expose
    private Long MaxAgeTime;

    /**
     * Get Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect 
     * @return MaxAgeType Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
     */
    public String getMaxAgeType() {
        return this.MaxAgeType;
    }

    /**
     * Set Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
     * @param MaxAgeType Rule types:
all: all files take effect
file: specified file suffixes take effect
directory: specified paths take effect
path: specified absolute paths take effect
     */
    public void setMaxAgeType(String MaxAgeType) {
        this.MaxAgeType = MaxAgeType;
    }

    /**
     * Get Matching content under the corresponding types for MaxAgeType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html. 
     * @return MaxAgeContents Matching content under the corresponding types for MaxAgeType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
     */
    public String [] getMaxAgeContents() {
        return this.MaxAgeContents;
    }

    /**
     * Set Matching content under the corresponding types for MaxAgeType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
     * @param MaxAgeContents Matching content under the corresponding types for MaxAgeType:
For "all", enter an asterisk (*).
For "file", enter the suffix, such as jpg, txt.
For "directory", enter the path, such as /xxx/test/.
For "path", enter the corresponding absolute path, such as /xxx/test.html.
     */
    public void setMaxAgeContents(String [] MaxAgeContents) {
        this.MaxAgeContents = MaxAgeContents;
    }

    /**
     * Get MaxAge time settings (in seconds) 
     * @return MaxAgeTime MaxAge time settings (in seconds)
     */
    public Long getMaxAgeTime() {
        return this.MaxAgeTime;
    }

    /**
     * Set MaxAge time settings (in seconds)
     * @param MaxAgeTime MaxAge time settings (in seconds)
     */
    public void setMaxAgeTime(Long MaxAgeTime) {
        this.MaxAgeTime = MaxAgeTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaxAgeType", this.MaxAgeType);
        this.setParamArraySimple(map, prefix + "MaxAgeContents.", this.MaxAgeContents);
        this.setParamSimple(map, prefix + "MaxAgeTime", this.MaxAgeTime);

    }
}

