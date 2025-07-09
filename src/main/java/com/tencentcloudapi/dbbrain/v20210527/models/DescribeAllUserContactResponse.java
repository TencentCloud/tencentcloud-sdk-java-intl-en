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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAllUserContactResponse extends AbstractModel {

    /**
    * Total number of recipients.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Recipient information.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Contacts")
    @Expose
    private ContactItem [] Contacts;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of recipients. 
     * @return TotalCount Total number of recipients.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of recipients.
     * @param TotalCount Total number of recipients.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Recipient information.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Contacts Recipient information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ContactItem [] getContacts() {
        return this.Contacts;
    }

    /**
     * Set Recipient information.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Contacts Recipient information.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContacts(ContactItem [] Contacts) {
        this.Contacts = Contacts;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeAllUserContactResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAllUserContactResponse(DescribeAllUserContactResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Contacts != null) {
            this.Contacts = new ContactItem[source.Contacts.length];
            for (int i = 0; i < source.Contacts.length; i++) {
                this.Contacts[i] = new ContactItem(source.Contacts[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Contacts.", this.Contacts);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

