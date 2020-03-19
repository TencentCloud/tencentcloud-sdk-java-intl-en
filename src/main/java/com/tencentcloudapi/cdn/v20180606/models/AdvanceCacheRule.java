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

public class AdvanceCacheRule extends AbstractModel{

    /**
    * Rule types:
`all`: effective for all files
`file`: effective for specified file suffixes
`directory`: effective for specified paths
`path`: effective for specified absolute paths
`default`: the cache rules when the origin server has not returned max-age
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheType")
    @Expose
    private String CacheType;

    /**
    * Content for each CacheType:
For `all`, enter an asterisk (*).
For `file`, enter the suffix, such as jpg, txt.
For `directory`, enter the path, such as /xxx/test/.
For `path`, enter the corresponding absolute path, such as /xxx/test.html.
For `default`, enter "no max-age".
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheContents")
    @Expose
    private String [] CacheContents;

    /**
    * Cache expiration time
Unit: second. The maximum value is 365 days.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get Rule types:
`all`: effective for all files
`file`: effective for specified file suffixes
`directory`: effective for specified paths
`path`: effective for specified absolute paths
`default`: the cache rules when the origin server has not returned max-age
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CacheType Rule types:
`all`: effective for all files
`file`: effective for specified file suffixes
`directory`: effective for specified paths
`path`: effective for specified absolute paths
`default`: the cache rules when the origin server has not returned max-age
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getCacheType() {
        return this.CacheType;
    }

    /**
     * Set Rule types:
`all`: effective for all files
`file`: effective for specified file suffixes
`directory`: effective for specified paths
`path`: effective for specified absolute paths
`default`: the cache rules when the origin server has not returned max-age
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CacheType Rule types:
`all`: effective for all files
`file`: effective for specified file suffixes
`directory`: effective for specified paths
`path`: effective for specified absolute paths
`default`: the cache rules when the origin server has not returned max-age
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheType(String CacheType) {
        this.CacheType = CacheType;
    }

    /**
     * Get Content for each CacheType:
For `all`, enter an asterisk (*).
For `file`, enter the suffix, such as jpg, txt.
For `directory`, enter the path, such as /xxx/test/.
For `path`, enter the corresponding absolute path, such as /xxx/test.html.
For `default`, enter "no max-age".
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CacheContents Content for each CacheType:
For `all`, enter an asterisk (*).
For `file`, enter the suffix, such as jpg, txt.
For `directory`, enter the path, such as /xxx/test/.
For `path`, enter the corresponding absolute path, such as /xxx/test.html.
For `default`, enter "no max-age".
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String [] getCacheContents() {
        return this.CacheContents;
    }

    /**
     * Set Content for each CacheType:
For `all`, enter an asterisk (*).
For `file`, enter the suffix, such as jpg, txt.
For `directory`, enter the path, such as /xxx/test/.
For `path`, enter the corresponding absolute path, such as /xxx/test.html.
For `default`, enter "no max-age".
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CacheContents Content for each CacheType:
For `all`, enter an asterisk (*).
For `file`, enter the suffix, such as jpg, txt.
For `directory`, enter the path, such as /xxx/test/.
For `path`, enter the corresponding absolute path, such as /xxx/test.html.
For `default`, enter "no max-age".
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheContents(String [] CacheContents) {
        this.CacheContents = CacheContents;
    }

    /**
     * Get Cache expiration time
Unit: second. The maximum value is 365 days.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return CacheTime Cache expiration time
Unit: second. The maximum value is 365 days.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Cache expiration time
Unit: second. The maximum value is 365 days.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param CacheTime Cache expiration time
Unit: second. The maximum value is 365 days.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CacheType", this.CacheType);
        this.setParamArraySimple(map, prefix + "CacheContents.", this.CacheContents);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

