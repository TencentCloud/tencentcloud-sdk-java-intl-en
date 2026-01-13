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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShareBlueprintAcrossAccountsRequest extends AbstractModel {

    /**
    * Image ID, which can be obtained through the BlueprintId returned by the [DescribeBlueprints](https://www.tencentcloud.com/document/product/1207/47689?from_cn_redirect=1) API.
    */
    @SerializedName("BlueprintId")
    @Expose
    private String BlueprintId;

    /**
    * List of [account IDs](https://www.tencentcloud.com/document/product/213/4944?from_cn_redirect=1#.E8.8E.B7.E5.8F.96.E4.B8.BB.E8.B4.A6.E5.8F.B7.E7.9A.84.E8.B4.A6.E5.8F.B7-id) that receive the shared images. The account ID is different from the QQ number. To query a user account ID, view the account ID column in the account information. The maximum number of accounts is 10.
    */
    @SerializedName("AccountIds")
    @Expose
    private String [] AccountIds;

    /**
     * Get Image ID, which can be obtained through the BlueprintId returned by the [DescribeBlueprints](https://www.tencentcloud.com/document/product/1207/47689?from_cn_redirect=1) API. 
     * @return BlueprintId Image ID, which can be obtained through the BlueprintId returned by the [DescribeBlueprints](https://www.tencentcloud.com/document/product/1207/47689?from_cn_redirect=1) API.
     */
    public String getBlueprintId() {
        return this.BlueprintId;
    }

    /**
     * Set Image ID, which can be obtained through the BlueprintId returned by the [DescribeBlueprints](https://www.tencentcloud.com/document/product/1207/47689?from_cn_redirect=1) API.
     * @param BlueprintId Image ID, which can be obtained through the BlueprintId returned by the [DescribeBlueprints](https://www.tencentcloud.com/document/product/1207/47689?from_cn_redirect=1) API.
     */
    public void setBlueprintId(String BlueprintId) {
        this.BlueprintId = BlueprintId;
    }

    /**
     * Get List of [account IDs](https://www.tencentcloud.com/document/product/213/4944?from_cn_redirect=1#.E8.8E.B7.E5.8F.96.E4.B8.BB.E8.B4.A6.E5.8F.B7.E7.9A.84.E8.B4.A6.E5.8F.B7-id) that receive the shared images. The account ID is different from the QQ number. To query a user account ID, view the account ID column in the account information. The maximum number of accounts is 10. 
     * @return AccountIds List of [account IDs](https://www.tencentcloud.com/document/product/213/4944?from_cn_redirect=1#.E8.8E.B7.E5.8F.96.E4.B8.BB.E8.B4.A6.E5.8F.B7.E7.9A.84.E8.B4.A6.E5.8F.B7-id) that receive the shared images. The account ID is different from the QQ number. To query a user account ID, view the account ID column in the account information. The maximum number of accounts is 10.
     */
    public String [] getAccountIds() {
        return this.AccountIds;
    }

    /**
     * Set List of [account IDs](https://www.tencentcloud.com/document/product/213/4944?from_cn_redirect=1#.E8.8E.B7.E5.8F.96.E4.B8.BB.E8.B4.A6.E5.8F.B7.E7.9A.84.E8.B4.A6.E5.8F.B7-id) that receive the shared images. The account ID is different from the QQ number. To query a user account ID, view the account ID column in the account information. The maximum number of accounts is 10.
     * @param AccountIds List of [account IDs](https://www.tencentcloud.com/document/product/213/4944?from_cn_redirect=1#.E8.8E.B7.E5.8F.96.E4.B8.BB.E8.B4.A6.E5.8F.B7.E7.9A.84.E8.B4.A6.E5.8F.B7-id) that receive the shared images. The account ID is different from the QQ number. To query a user account ID, view the account ID column in the account information. The maximum number of accounts is 10.
     */
    public void setAccountIds(String [] AccountIds) {
        this.AccountIds = AccountIds;
    }

    public ShareBlueprintAcrossAccountsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareBlueprintAcrossAccountsRequest(ShareBlueprintAcrossAccountsRequest source) {
        if (source.BlueprintId != null) {
            this.BlueprintId = new String(source.BlueprintId);
        }
        if (source.AccountIds != null) {
            this.AccountIds = new String[source.AccountIds.length];
            for (int i = 0; i < source.AccountIds.length; i++) {
                this.AccountIds[i] = new String(source.AccountIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlueprintId", this.BlueprintId);
        this.setParamArraySimple(map, prefix + "AccountIds.", this.AccountIds);

    }
}

