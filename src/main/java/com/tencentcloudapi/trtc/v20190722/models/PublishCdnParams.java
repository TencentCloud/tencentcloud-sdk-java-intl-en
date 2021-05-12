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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PublishCdnParams extends AbstractModel{

    /**
    * Tencent Cloud LVB BizId
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * Destination of non-Tencent Cloud CDN relayed push. It is possible to push to only one non-Tencent Cloud CDN address at a time.
    */
    @SerializedName("PublishCdnUrls")
    @Expose
    private String [] PublishCdnUrls;

    /**
     * Get Tencent Cloud LVB BizId 
     * @return BizId Tencent Cloud LVB BizId
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set Tencent Cloud LVB BizId
     * @param BizId Tencent Cloud LVB BizId
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get Destination of non-Tencent Cloud CDN relayed push. It is possible to push to only one non-Tencent Cloud CDN address at a time. 
     * @return PublishCdnUrls Destination of non-Tencent Cloud CDN relayed push. It is possible to push to only one non-Tencent Cloud CDN address at a time.
     */
    public String [] getPublishCdnUrls() {
        return this.PublishCdnUrls;
    }

    /**
     * Set Destination of non-Tencent Cloud CDN relayed push. It is possible to push to only one non-Tencent Cloud CDN address at a time.
     * @param PublishCdnUrls Destination of non-Tencent Cloud CDN relayed push. It is possible to push to only one non-Tencent Cloud CDN address at a time.
     */
    public void setPublishCdnUrls(String [] PublishCdnUrls) {
        this.PublishCdnUrls = PublishCdnUrls;
    }

    public PublishCdnParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PublishCdnParams(PublishCdnParams source) {
        if (source.BizId != null) {
            this.BizId = new Long(source.BizId);
        }
        if (source.PublishCdnUrls != null) {
            this.PublishCdnUrls = new String[source.PublishCdnUrls.length];
            for (int i = 0; i < source.PublishCdnUrls.length; i++) {
                this.PublishCdnUrls[i] = new String(source.PublishCdnUrls[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamArraySimple(map, prefix + "PublishCdnUrls.", this.PublishCdnUrls);

    }
}

