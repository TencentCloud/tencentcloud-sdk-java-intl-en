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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PutProvisionedConcurrencyConfigRequest extends AbstractModel {

    /**
    * Name of the function for which to set the provisioned concurrency
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * Function version number. Note: the `$LATEST` version does not support provisioned concurrency
    */
    @SerializedName("Qualifier")
    @Expose
    private String Qualifier;

    /**
    * Provisioned concurrency amount. Note: there is an upper limit for the sum of provisioned concurrency amounts of all versions, which currently is the function's maximum concurrency quota minus 100
    */
    @SerializedName("VersionProvisionedConcurrencyNum")
    @Expose
    private Long VersionProvisionedConcurrencyNum;

    /**
    * Function namespace. Default value: `default`
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Scheduled provisioned concurrency scaling action
    */
    @SerializedName("TriggerActions")
    @Expose
    private TriggerAction [] TriggerActions;

    /**
    * Specifies the provisioned concurrency type.
`Default`: Static provisioned concurrency. 
`ConcurrencyUtilizationTracking`: Scales the concurrency automatically according to the concurrency utilization.
If `ConcurrencyUtilizationTracking` is passed in, 

`TrackingTarget`, `MinCapacity` and `MaxCapacity` are required, and `VersionProvisionedConcurrencyNum` must be `0`. 
    */
    @SerializedName("ProvisionedType")
    @Expose
    private String ProvisionedType;

    /**
    * The target concurrency utilization. Range: (0,1) (two decimal places)
    */
    @SerializedName("TrackingTarget")
    @Expose
    private Float TrackingTarget;

    /**
    * The minimum number of instances. It can not be smaller than `1`.
    */
    @SerializedName("MinCapacity")
    @Expose
    private Long MinCapacity;

    /**
    * The maximum number of instances
    */
    @SerializedName("MaxCapacity")
    @Expose
    private Long MaxCapacity;

    /**
     * Get Name of the function for which to set the provisioned concurrency 
     * @return FunctionName Name of the function for which to set the provisioned concurrency
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set Name of the function for which to set the provisioned concurrency
     * @param FunctionName Name of the function for which to set the provisioned concurrency
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get Function version number. Note: the `$LATEST` version does not support provisioned concurrency 
     * @return Qualifier Function version number. Note: the `$LATEST` version does not support provisioned concurrency
     */
    public String getQualifier() {
        return this.Qualifier;
    }

    /**
     * Set Function version number. Note: the `$LATEST` version does not support provisioned concurrency
     * @param Qualifier Function version number. Note: the `$LATEST` version does not support provisioned concurrency
     */
    public void setQualifier(String Qualifier) {
        this.Qualifier = Qualifier;
    }

    /**
     * Get Provisioned concurrency amount. Note: there is an upper limit for the sum of provisioned concurrency amounts of all versions, which currently is the function's maximum concurrency quota minus 100 
     * @return VersionProvisionedConcurrencyNum Provisioned concurrency amount. Note: there is an upper limit for the sum of provisioned concurrency amounts of all versions, which currently is the function's maximum concurrency quota minus 100
     */
    public Long getVersionProvisionedConcurrencyNum() {
        return this.VersionProvisionedConcurrencyNum;
    }

    /**
     * Set Provisioned concurrency amount. Note: there is an upper limit for the sum of provisioned concurrency amounts of all versions, which currently is the function's maximum concurrency quota minus 100
     * @param VersionProvisionedConcurrencyNum Provisioned concurrency amount. Note: there is an upper limit for the sum of provisioned concurrency amounts of all versions, which currently is the function's maximum concurrency quota minus 100
     */
    public void setVersionProvisionedConcurrencyNum(Long VersionProvisionedConcurrencyNum) {
        this.VersionProvisionedConcurrencyNum = VersionProvisionedConcurrencyNum;
    }

    /**
     * Get Function namespace. Default value: `default` 
     * @return Namespace Function namespace. Default value: `default`
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Function namespace. Default value: `default`
     * @param Namespace Function namespace. Default value: `default`
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Scheduled provisioned concurrency scaling action 
     * @return TriggerActions Scheduled provisioned concurrency scaling action
     */
    public TriggerAction [] getTriggerActions() {
        return this.TriggerActions;
    }

    /**
     * Set Scheduled provisioned concurrency scaling action
     * @param TriggerActions Scheduled provisioned concurrency scaling action
     */
    public void setTriggerActions(TriggerAction [] TriggerActions) {
        this.TriggerActions = TriggerActions;
    }

    /**
     * Get Specifies the provisioned concurrency type.
`Default`: Static provisioned concurrency. 
`ConcurrencyUtilizationTracking`: Scales the concurrency automatically according to the concurrency utilization.
If `ConcurrencyUtilizationTracking` is passed in, 

`TrackingTarget`, `MinCapacity` and `MaxCapacity` are required, and `VersionProvisionedConcurrencyNum` must be `0`.  
     * @return ProvisionedType Specifies the provisioned concurrency type.
`Default`: Static provisioned concurrency. 
`ConcurrencyUtilizationTracking`: Scales the concurrency automatically according to the concurrency utilization.
If `ConcurrencyUtilizationTracking` is passed in, 

`TrackingTarget`, `MinCapacity` and `MaxCapacity` are required, and `VersionProvisionedConcurrencyNum` must be `0`. 
     */
    public String getProvisionedType() {
        return this.ProvisionedType;
    }

    /**
     * Set Specifies the provisioned concurrency type.
`Default`: Static provisioned concurrency. 
`ConcurrencyUtilizationTracking`: Scales the concurrency automatically according to the concurrency utilization.
If `ConcurrencyUtilizationTracking` is passed in, 

`TrackingTarget`, `MinCapacity` and `MaxCapacity` are required, and `VersionProvisionedConcurrencyNum` must be `0`. 
     * @param ProvisionedType Specifies the provisioned concurrency type.
`Default`: Static provisioned concurrency. 
`ConcurrencyUtilizationTracking`: Scales the concurrency automatically according to the concurrency utilization.
If `ConcurrencyUtilizationTracking` is passed in, 

`TrackingTarget`, `MinCapacity` and `MaxCapacity` are required, and `VersionProvisionedConcurrencyNum` must be `0`. 
     */
    public void setProvisionedType(String ProvisionedType) {
        this.ProvisionedType = ProvisionedType;
    }

    /**
     * Get The target concurrency utilization. Range: (0,1) (two decimal places) 
     * @return TrackingTarget The target concurrency utilization. Range: (0,1) (two decimal places)
     */
    public Float getTrackingTarget() {
        return this.TrackingTarget;
    }

    /**
     * Set The target concurrency utilization. Range: (0,1) (two decimal places)
     * @param TrackingTarget The target concurrency utilization. Range: (0,1) (two decimal places)
     */
    public void setTrackingTarget(Float TrackingTarget) {
        this.TrackingTarget = TrackingTarget;
    }

    /**
     * Get The minimum number of instances. It can not be smaller than `1`. 
     * @return MinCapacity The minimum number of instances. It can not be smaller than `1`.
     */
    public Long getMinCapacity() {
        return this.MinCapacity;
    }

    /**
     * Set The minimum number of instances. It can not be smaller than `1`.
     * @param MinCapacity The minimum number of instances. It can not be smaller than `1`.
     */
    public void setMinCapacity(Long MinCapacity) {
        this.MinCapacity = MinCapacity;
    }

    /**
     * Get The maximum number of instances 
     * @return MaxCapacity The maximum number of instances
     */
    public Long getMaxCapacity() {
        return this.MaxCapacity;
    }

    /**
     * Set The maximum number of instances
     * @param MaxCapacity The maximum number of instances
     */
    public void setMaxCapacity(Long MaxCapacity) {
        this.MaxCapacity = MaxCapacity;
    }

    public PutProvisionedConcurrencyConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PutProvisionedConcurrencyConfigRequest(PutProvisionedConcurrencyConfigRequest source) {
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Qualifier != null) {
            this.Qualifier = new String(source.Qualifier);
        }
        if (source.VersionProvisionedConcurrencyNum != null) {
            this.VersionProvisionedConcurrencyNum = new Long(source.VersionProvisionedConcurrencyNum);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.TriggerActions != null) {
            this.TriggerActions = new TriggerAction[source.TriggerActions.length];
            for (int i = 0; i < source.TriggerActions.length; i++) {
                this.TriggerActions[i] = new TriggerAction(source.TriggerActions[i]);
            }
        }
        if (source.ProvisionedType != null) {
            this.ProvisionedType = new String(source.ProvisionedType);
        }
        if (source.TrackingTarget != null) {
            this.TrackingTarget = new Float(source.TrackingTarget);
        }
        if (source.MinCapacity != null) {
            this.MinCapacity = new Long(source.MinCapacity);
        }
        if (source.MaxCapacity != null) {
            this.MaxCapacity = new Long(source.MaxCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Qualifier", this.Qualifier);
        this.setParamSimple(map, prefix + "VersionProvisionedConcurrencyNum", this.VersionProvisionedConcurrencyNum);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamArrayObj(map, prefix + "TriggerActions.", this.TriggerActions);
        this.setParamSimple(map, prefix + "ProvisionedType", this.ProvisionedType);
        this.setParamSimple(map, prefix + "TrackingTarget", this.TrackingTarget);
        this.setParamSimple(map, prefix + "MinCapacity", this.MinCapacity);
        this.setParamSimple(map, prefix + "MaxCapacity", this.MaxCapacity);

    }
}

