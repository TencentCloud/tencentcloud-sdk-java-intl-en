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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCurrentPlaylistRequest extends AbstractModel {

    /**
    * <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id.</b>.
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * The unique identifier of the playlist.
    */
    @SerializedName("RoundPlayId")
    @Expose
    private String RoundPlayId;

    /**
    * The length of the returned playlist. maximum is 10, default value is 5.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id.</b>. 
     * @return SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id.</b>.
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id.</b>.
     * @param SubAppId <B>VOD [subapplication](https://intl.cloud.tencent.com/document/product/266/14574?from_cn_redirect=1) id.</b>.
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get The unique identifier of the playlist. 
     * @return RoundPlayId The unique identifier of the playlist.
     */
    public String getRoundPlayId() {
        return this.RoundPlayId;
    }

    /**
     * Set The unique identifier of the playlist.
     * @param RoundPlayId The unique identifier of the playlist.
     */
    public void setRoundPlayId(String RoundPlayId) {
        this.RoundPlayId = RoundPlayId;
    }

    /**
     * Get The length of the returned playlist. maximum is 10, default value is 5. 
     * @return Limit The length of the returned playlist. maximum is 10, default value is 5.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The length of the returned playlist. maximum is 10, default value is 5.
     * @param Limit The length of the returned playlist. maximum is 10, default value is 5.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeCurrentPlaylistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCurrentPlaylistRequest(DescribeCurrentPlaylistRequest source) {
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.RoundPlayId != null) {
            this.RoundPlayId = new String(source.RoundPlayId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "RoundPlayId", this.RoundPlayId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

