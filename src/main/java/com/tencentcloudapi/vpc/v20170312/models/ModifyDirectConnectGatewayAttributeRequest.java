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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDirectConnectGatewayAttributeRequest extends AbstractModel {

    /**
    * The unique ID of the direct connect gateway, such as `dcg-9o233uri`.
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * The direct connect gateway name. You can enter any name within 60 characters.
    */
    @SerializedName("DirectConnectGatewayName")
    @Expose
    private String DirectConnectGatewayName;

    /**
    * The CCN route-learning type. Valid values: `BGP` (Automatic learning), `STATIC` (Static, that is, user-configured). You can only modify `CcnRouteType` for a CCN direct connect gateway with BGP enabled.
    */
    @SerializedName("CcnRouteType")
    @Expose
    private String CcnRouteType;

    /**
    * CCN route publishing method. Valid values: `standard` and `exquisite`. You can only modify `ModeType` for a CCN direct connect gateway.
    */
    @SerializedName("ModeType")
    @Expose
    private String ModeType;

    /**
     * Get The unique ID of the direct connect gateway, such as `dcg-9o233uri`. 
     * @return DirectConnectGatewayId The unique ID of the direct connect gateway, such as `dcg-9o233uri`.
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * Set The unique ID of the direct connect gateway, such as `dcg-9o233uri`.
     * @param DirectConnectGatewayId The unique ID of the direct connect gateway, such as `dcg-9o233uri`.
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * Get The direct connect gateway name. You can enter any name within 60 characters. 
     * @return DirectConnectGatewayName The direct connect gateway name. You can enter any name within 60 characters.
     */
    public String getDirectConnectGatewayName() {
        return this.DirectConnectGatewayName;
    }

    /**
     * Set The direct connect gateway name. You can enter any name within 60 characters.
     * @param DirectConnectGatewayName The direct connect gateway name. You can enter any name within 60 characters.
     */
    public void setDirectConnectGatewayName(String DirectConnectGatewayName) {
        this.DirectConnectGatewayName = DirectConnectGatewayName;
    }

    /**
     * Get The CCN route-learning type. Valid values: `BGP` (Automatic learning), `STATIC` (Static, that is, user-configured). You can only modify `CcnRouteType` for a CCN direct connect gateway with BGP enabled. 
     * @return CcnRouteType The CCN route-learning type. Valid values: `BGP` (Automatic learning), `STATIC` (Static, that is, user-configured). You can only modify `CcnRouteType` for a CCN direct connect gateway with BGP enabled.
     */
    public String getCcnRouteType() {
        return this.CcnRouteType;
    }

    /**
     * Set The CCN route-learning type. Valid values: `BGP` (Automatic learning), `STATIC` (Static, that is, user-configured). You can only modify `CcnRouteType` for a CCN direct connect gateway with BGP enabled.
     * @param CcnRouteType The CCN route-learning type. Valid values: `BGP` (Automatic learning), `STATIC` (Static, that is, user-configured). You can only modify `CcnRouteType` for a CCN direct connect gateway with BGP enabled.
     */
    public void setCcnRouteType(String CcnRouteType) {
        this.CcnRouteType = CcnRouteType;
    }

    /**
     * Get CCN route publishing method. Valid values: `standard` and `exquisite`. You can only modify `ModeType` for a CCN direct connect gateway. 
     * @return ModeType CCN route publishing method. Valid values: `standard` and `exquisite`. You can only modify `ModeType` for a CCN direct connect gateway.
     */
    public String getModeType() {
        return this.ModeType;
    }

    /**
     * Set CCN route publishing method. Valid values: `standard` and `exquisite`. You can only modify `ModeType` for a CCN direct connect gateway.
     * @param ModeType CCN route publishing method. Valid values: `standard` and `exquisite`. You can only modify `ModeType` for a CCN direct connect gateway.
     */
    public void setModeType(String ModeType) {
        this.ModeType = ModeType;
    }

    public ModifyDirectConnectGatewayAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDirectConnectGatewayAttributeRequest(ModifyDirectConnectGatewayAttributeRequest source) {
        if (source.DirectConnectGatewayId != null) {
            this.DirectConnectGatewayId = new String(source.DirectConnectGatewayId);
        }
        if (source.DirectConnectGatewayName != null) {
            this.DirectConnectGatewayName = new String(source.DirectConnectGatewayName);
        }
        if (source.CcnRouteType != null) {
            this.CcnRouteType = new String(source.CcnRouteType);
        }
        if (source.ModeType != null) {
            this.ModeType = new String(source.ModeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayName", this.DirectConnectGatewayName);
        this.setParamSimple(map, prefix + "CcnRouteType", this.CcnRouteType);
        this.setParamSimple(map, prefix + "ModeType", this.ModeType);

    }
}

