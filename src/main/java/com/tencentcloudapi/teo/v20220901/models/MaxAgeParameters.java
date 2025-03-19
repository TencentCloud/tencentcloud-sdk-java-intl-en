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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaxAgeParameters extends AbstractModel {

    /**
    * Specifies whether to follow the origin server cache-control configuration, with the following values:.
<Li>`On`: follow the origin server and ignore the field cachetime;</li>.
<Li>`Off`: do not follow the origin server and apply the field cachetime.</li>.
    */
    @SerializedName("FollowOrigin")
    @Expose
    private String FollowOrigin;

    /**
    * Custom cache time value, unit: seconds. value range: 0-315360000.<br>note: when followorigin is off, it means not following the origin server and using cachetime to set the cache time; otherwise, this field will not take effect.
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
     * Get Specifies whether to follow the origin server cache-control configuration, with the following values:.
<Li>`On`: follow the origin server and ignore the field cachetime;</li>.
<Li>`Off`: do not follow the origin server and apply the field cachetime.</li>. 
     * @return FollowOrigin Specifies whether to follow the origin server cache-control configuration, with the following values:.
<Li>`On`: follow the origin server and ignore the field cachetime;</li>.
<Li>`Off`: do not follow the origin server and apply the field cachetime.</li>.
     */
    public String getFollowOrigin() {
        return this.FollowOrigin;
    }

    /**
     * Set Specifies whether to follow the origin server cache-control configuration, with the following values:.
<Li>`On`: follow the origin server and ignore the field cachetime;</li>.
<Li>`Off`: do not follow the origin server and apply the field cachetime.</li>.
     * @param FollowOrigin Specifies whether to follow the origin server cache-control configuration, with the following values:.
<Li>`On`: follow the origin server and ignore the field cachetime;</li>.
<Li>`Off`: do not follow the origin server and apply the field cachetime.</li>.
     */
    public void setFollowOrigin(String FollowOrigin) {
        this.FollowOrigin = FollowOrigin;
    }

    /**
     * Get Custom cache time value, unit: seconds. value range: 0-315360000.<br>note: when followorigin is off, it means not following the origin server and using cachetime to set the cache time; otherwise, this field will not take effect. 
     * @return CacheTime Custom cache time value, unit: seconds. value range: 0-315360000.<br>note: when followorigin is off, it means not following the origin server and using cachetime to set the cache time; otherwise, this field will not take effect.
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set Custom cache time value, unit: seconds. value range: 0-315360000.<br>note: when followorigin is off, it means not following the origin server and using cachetime to set the cache time; otherwise, this field will not take effect.
     * @param CacheTime Custom cache time value, unit: seconds. value range: 0-315360000.<br>note: when followorigin is off, it means not following the origin server and using cachetime to set the cache time; otherwise, this field will not take effect.
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    public MaxAgeParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaxAgeParameters(MaxAgeParameters source) {
        if (source.FollowOrigin != null) {
            this.FollowOrigin = new String(source.FollowOrigin);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new Long(source.CacheTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FollowOrigin", this.FollowOrigin);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);

    }
}

