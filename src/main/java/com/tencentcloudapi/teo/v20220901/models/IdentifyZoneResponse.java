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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdentifyZoneResponse extends AbstractModel {

    /**
    * Details of the DNS record.
    */
    @SerializedName("Ascription")
    @Expose
    private AscriptionInfo Ascription;

    /**
    * Details of the verification file.
    */
    @SerializedName("FileAscription")
    @Expose
    private FileAscriptionInfo FileAscription;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Details of the DNS record. 
     * @return Ascription Details of the DNS record.
     */
    public AscriptionInfo getAscription() {
        return this.Ascription;
    }

    /**
     * Set Details of the DNS record.
     * @param Ascription Details of the DNS record.
     */
    public void setAscription(AscriptionInfo Ascription) {
        this.Ascription = Ascription;
    }

    /**
     * Get Details of the verification file. 
     * @return FileAscription Details of the verification file.
     */
    public FileAscriptionInfo getFileAscription() {
        return this.FileAscription;
    }

    /**
     * Set Details of the verification file.
     * @param FileAscription Details of the verification file.
     */
    public void setFileAscription(FileAscriptionInfo FileAscription) {
        this.FileAscription = FileAscription;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public IdentifyZoneResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdentifyZoneResponse(IdentifyZoneResponse source) {
        if (source.Ascription != null) {
            this.Ascription = new AscriptionInfo(source.Ascription);
        }
        if (source.FileAscription != null) {
            this.FileAscription = new FileAscriptionInfo(source.FileAscription);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Ascription.", this.Ascription);
        this.setParamObj(map, prefix + "FileAscription.", this.FileAscription);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

