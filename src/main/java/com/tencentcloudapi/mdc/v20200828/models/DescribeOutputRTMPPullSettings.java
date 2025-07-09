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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOutputRTMPPullSettings extends AbstractModel {

    /**
    * List of pull URLs
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("ServerUrls")
    @Expose
    private DescribeOutputRTMPPullServerUrl [] ServerUrls;

    /**
     * Get List of pull URLs
Note: This field may return `null`, indicating that no valid value was found. 
     * @return ServerUrls List of pull URLs
Note: This field may return `null`, indicating that no valid value was found.
     */
    public DescribeOutputRTMPPullServerUrl [] getServerUrls() {
        return this.ServerUrls;
    }

    /**
     * Set List of pull URLs
Note: This field may return `null`, indicating that no valid value was found.
     * @param ServerUrls List of pull URLs
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setServerUrls(DescribeOutputRTMPPullServerUrl [] ServerUrls) {
        this.ServerUrls = ServerUrls;
    }

    public DescribeOutputRTMPPullSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOutputRTMPPullSettings(DescribeOutputRTMPPullSettings source) {
        if (source.ServerUrls != null) {
            this.ServerUrls = new DescribeOutputRTMPPullServerUrl[source.ServerUrls.length];
            for (int i = 0; i < source.ServerUrls.length; i++) {
                this.ServerUrls[i] = new DescribeOutputRTMPPullServerUrl(source.ServerUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ServerUrls.", this.ServerUrls);

    }
}

