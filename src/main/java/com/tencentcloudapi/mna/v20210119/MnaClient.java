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
package com.tencentcloudapi.mna.v20210119;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mna.v20210119.models.*;

public class MnaClient extends AbstractClient{
    private static String endpoint = "mna.intl.tencentcloudapi.com";
    private static String service = "mna";
    private static String version = "2021-01-19";

    public MnaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public MnaClient(Credential credential, String region, ClientProfile profile) {
        super(MnaClient.endpoint, MnaClient.version, credential, region, profile);
    }

    /**
     *Activate hardware device
     * @param req ActivateHardwareRequest
     * @return ActivateHardwareResponse
     * @throws TencentCloudSDKException
     */
    public ActivateHardwareResponse ActivateHardware(ActivateHardwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ActivateHardware", ActivateHardwareResponse.class);
    }

    /**
     *This API is used to create an application
     * @param req AddApplicationRequest
     * @return AddApplicationResponse
     * @throws TencentCloudSDKException
     */
    public AddApplicationResponse AddApplication(AddApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddApplication", AddApplicationResponse.class);
    }

    /**
     *Create new device records
     * @param req AddDeviceRequest
     * @return AddDeviceResponse
     * @throws TencentCloudSDKException
     */
    public AddDeviceResponse AddDevice(AddDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddDevice", AddDeviceResponse.class);
    }

    /**
     *Create group
     * @param req AddGroupRequest
     * @return AddGroupResponse
     * @throws TencentCloudSDKException
     */
    public AddGroupResponse AddGroup(AddGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddGroup", AddGroupResponse.class);
    }

    /**
     *Add hardware devices, generate inactive hardware devices, and support batch addition
     * @param req AddHardwareRequest
     * @return AddHardwareResponse
     * @throws TencentCloudSDKException
     */
    public AddHardwareResponse AddHardware(AddHardwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddHardware", AddHardwareResponse.class);
    }

    /**
     *Create an interconnection rule
     * @param req AddL3ConnRequest
     * @return AddL3ConnResponse
     * @throws TencentCloudSDKException
     */
    public AddL3ConnResponse AddL3Conn(AddL3ConnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "AddL3Conn", AddL3ConnResponse.class);
    }

    /**
     *This API is used to configure and refresh preset keys.
     * @param req CreateEncryptedKeyRequest
     * @return CreateEncryptedKeyResponse
     * @throws TencentCloudSDKException
     */
    public CreateEncryptedKeyResponse CreateEncryptedKey(CreateEncryptedKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateEncryptedKey", CreateEncryptedKeyResponse.class);
    }

    /**
     *This API is used to delete applications
     * @param req DeleteApplicationRequest
     * @return DeleteApplicationResponse
     * @throws TencentCloudSDKException
     */
    public DeleteApplicationResponse DeleteApplication(DeleteApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteApplication", DeleteApplicationResponse.class);
    }

    /**
     *Delete device info
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDevice", DeleteDeviceResponse.class);
    }

    /**
     *Delete group
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteGroup", DeleteGroupResponse.class);
    }

    /**
     *Delete an interconnection rule
     * @param req DeleteL3ConnRequest
     * @return DeleteL3ConnResponse
     * @throws TencentCloudSDKException
     */
    public DeleteL3ConnResponse DeleteL3Conn(DeleteL3ConnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteL3Conn", DeleteL3ConnResponse.class);
    }

    /**
     *Query the access region list.
     * @param req DescribeAccessRegionsRequest
     * @return DescribeAccessRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessRegionsResponse DescribeAccessRegions(DescribeAccessRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAccessRegions", DescribeAccessRegionsResponse.class);
    }

    /**
     *Download the number of active devices statistics
     * @param req DownloadActiveDeviceCountRequest
     * @return DownloadActiveDeviceCountResponse
     * @throws TencentCloudSDKException
     */
    public DownloadActiveDeviceCountResponse DownloadActiveDeviceCount(DownloadActiveDeviceCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DownloadActiveDeviceCount", DownloadActiveDeviceCountResponse.class);
    }

    /**
     *Number of active devices statistics
     * @param req GetActiveDeviceCountRequest
     * @return GetActiveDeviceCountResponse
     * @throws TencentCloudSDKException
     */
    public GetActiveDeviceCountResponse GetActiveDeviceCount(GetActiveDeviceCountRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetActiveDeviceCount", GetActiveDeviceCountResponse.class);
    }

    /**
     *This API is used to query applications.
     * @param req GetApplicationRequest
     * @return GetApplicationResponse
     * @throws TencentCloudSDKException
     */
    public GetApplicationResponse GetApplication(GetApplicationRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetApplication", GetApplicationResponse.class);
    }

    /**
     *Statistics of a single device accessing the target IP address
     * @param req GetDestIPByNameRequest
     * @return GetDestIPByNameResponse
     * @throws TencentCloudSDKException
     */
    public GetDestIPByNameResponse GetDestIPByName(GetDestIPByNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDestIPByName", GetDestIPByNameResponse.class);
    }

    /**
     *This API is used to search device details by specified device ID.
     * @param req GetDeviceRequest
     * @return GetDeviceResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceResponse GetDevice(GetDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDevice", GetDeviceResponse.class);
    }

    /**
     *This API is used to obtain the payment mode of a device.
     * @param req GetDevicePayModeRequest
     * @return GetDevicePayModeResponse
     * @throws TencentCloudSDKException
     */
    public GetDevicePayModeResponse GetDevicePayMode(GetDevicePayModeRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDevicePayMode", GetDevicePayModeResponse.class);
    }

    /**
     *This API is used to get device information list.
     * @param req GetDevicesRequest
     * @return GetDevicesResponse
     * @throws TencentCloudSDKException
     */
    public GetDevicesResponse GetDevices(GetDevicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetDevices", GetDevicesResponse.class);
    }

    /**
     *This API is used to query user traffic alarm settings based on AppId, including threshold, callback url and key.
     * @param req GetFlowAlarmInfoRequest
     * @return GetFlowAlarmInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowAlarmInfoResponse GetFlowAlarmInfo(GetFlowAlarmInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowAlarmInfo", GetFlowAlarmInfoResponse.class);
    }

    /**
     *Retrieve the data transfer plan list
     * @param req GetFlowPackagesRequest
     * @return GetFlowPackagesResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowPackagesResponse GetFlowPackages(GetFlowPackagesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowPackages", GetFlowPackagesResponse.class);
    }

    /**
     *Retrieve traffic usage data for a specified device Id at a specified time point.
     * @param req GetFlowStatisticRequest
     * @return GetFlowStatisticResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowStatisticResponse GetFlowStatistic(GetFlowStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowStatistic", GetFlowStatisticResponse.class);
    }

    /**
     *Retrieve traffic usage data for the specified group and time period
     * @param req GetFlowStatisticByGroupRequest
     * @return GetFlowStatisticByGroupResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowStatisticByGroupResponse GetFlowStatisticByGroup(GetFlowStatisticByGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowStatisticByGroup", GetFlowStatisticByGroupResponse.class);
    }

    /**
     *Retrieve traffic usage data for a specified device Id at a specified time point.
     * @param req GetFlowStatisticByNameRequest
     * @return GetFlowStatisticByNameResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowStatisticByNameResponse GetFlowStatisticByName(GetFlowStatisticByNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowStatisticByName", GetFlowStatisticByNameResponse.class);
    }

    /**
     *Retrieve traffic usage data for the specified region and time point
     * @param req GetFlowStatisticByRegionRequest
     * @return GetFlowStatisticByRegionResponse
     * @throws TencentCloudSDKException
     */
    public GetFlowStatisticByRegionResponse GetFlowStatisticByRegion(GetFlowStatisticByRegionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetFlowStatisticByRegion", GetFlowStatisticByRegionResponse.class);
    }

    /**
     *View group details
     * @param req GetGroupDetailRequest
     * @return GetGroupDetailResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupDetailResponse GetGroupDetail(GetGroupDetailRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGroupDetail", GetGroupDetailResponse.class);
    }

    /**
     *This API is used to obtain a group list.
     * @param req GetGroupListRequest
     * @return GetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupListResponse GetGroupList(GetGroupListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetGroupList", GetGroupListResponse.class);
    }

    /**
     *This API is used to get hardware device information.
     * @param req GetHardwareInfoRequest
     * @return GetHardwareInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetHardwareInfoResponse GetHardwareInfo(GetHardwareInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetHardwareInfo", GetHardwareInfoResponse.class);
    }

    /**
     *This API is used to get the hardware list of the manufacturer.
     * @param req GetHardwareListRequest
     * @return GetHardwareListResponse
     * @throws TencentCloudSDKException
     */
    public GetHardwareListResponse GetHardwareList(GetHardwareListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetHardwareList", GetHardwareListResponse.class);
    }

    /**
     *Retrieve the list of interconnection rules
     * @param req GetL3ConnListRequest
     * @return GetL3ConnListResponse
     * @throws TencentCloudSDKException
     */
    public GetL3ConnListResponse GetL3ConnList(GetL3ConnListRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetL3ConnList", GetL3ConnListResponse.class);
    }

    /**
     *This API is used to obtain the download file URL for all monitoring metrics of a single device.
     * @param req GetMonitorDataByNameRequest
     * @return GetMonitorDataByNameResponse
     * @throws TencentCloudSDKException
     */
    public GetMonitorDataByNameResponse GetMonitorDataByName(GetMonitorDataByNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMonitorDataByName", GetMonitorDataByNameResponse.class);
    }

    /**
     *Obtain batch device traffic statistics curves
     * @param req GetMultiFlowStatisticRequest
     * @return GetMultiFlowStatisticResponse
     * @throws TencentCloudSDKException
     */
    public GetMultiFlowStatisticResponse GetMultiFlowStatistic(GetMultiFlowStatisticRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetMultiFlowStatistic", GetMultiFlowStatisticResponse.class);
    }

    /**
     *This API is used to obtain real-time traffic statistics per device.
     * @param req GetNetMonitorRequest
     * @return GetNetMonitorResponse
     * @throws TencentCloudSDKException
     */
    public GetNetMonitorResponse GetNetMonitor(GetNetMonitorRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetNetMonitor", GetNetMonitorResponse.class);
    }

    /**
     *This API is used to obtain real-time traffic statistics per device.
     * @param req GetNetMonitorByNameRequest
     * @return GetNetMonitorByNameResponse
     * @throws TencentCloudSDKException
     */
    public GetNetMonitorByNameResponse GetNetMonitorByName(GetNetMonitorByNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetNetMonitorByName", GetNetMonitorByNameResponse.class);
    }

    /**
     *This API is used to access the public key for signature verification.
     * @param req GetPublicKeyRequest
     * @return GetPublicKeyResponse
     * @throws TencentCloudSDKException
     */
    public GetPublicKeyResponse GetPublicKey(GetPublicKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetPublicKey", GetPublicKeyResponse.class);
    }

    /**
     *Download traffic data on the usage statistics page
     * @param req GetStatisticDataRequest
     * @return GetStatisticDataResponse
     * @throws TencentCloudSDKException
     */
    public GetStatisticDataResponse GetStatisticData(GetStatisticDataRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetStatisticData", GetStatisticDataResponse.class);
    }

    /**
     *Download traffic data on the usage statistics page
     * @param req GetStatisticDataByNameRequest
     * @return GetStatisticDataByNameResponse
     * @throws TencentCloudSDKException
     */
    public GetStatisticDataByNameResponse GetStatisticDataByName(GetStatisticDataByNameRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetStatisticDataByName", GetStatisticDataByNameResponse.class);
    }

    /**
     *This API is used to get the hardware device list of the manufacturer.
     * @param req GetVendorHardwareRequest
     * @return GetVendorHardwareResponse
     * @throws TencentCloudSDKException
     */
    public GetVendorHardwareResponse GetVendorHardware(GetVendorHardwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GetVendorHardware", GetVendorHardwareResponse.class);
    }

    /**
     *Add device to already exist group
     * @param req GroupAddDeviceRequest
     * @return GroupAddDeviceResponse
     * @throws TencentCloudSDKException
     */
    public GroupAddDeviceResponse GroupAddDevice(GroupAddDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GroupAddDevice", GroupAddDeviceResponse.class);
    }

    /**
     *Delete devices in the group
     * @param req GroupDeleteDeviceRequest
     * @return GroupDeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public GroupDeleteDeviceResponse GroupDeleteDevice(GroupDeleteDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "GroupDeleteDevice", GroupDeleteDeviceResponse.class);
    }

    /**
     *This API is used to modify device connectivity regions.
     * @param req ModifyDeviceAccessRegionsRequest
     * @return ModifyDeviceAccessRegionsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDeviceAccessRegionsResponse ModifyDeviceAccessRegions(ModifyDeviceAccessRegionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyDeviceAccessRegions", ModifyDeviceAccessRegionsResponse.class);
    }

    /**
     *Auto renewal of data transfer plans can be enabled or disabled, unaffected by ongoing effective plans in the current cycle.
     * @param req ModifyPackageRenewFlagRequest
     * @return ModifyPackageRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPackageRenewFlagResponse ModifyPackageRenewFlag(ModifyPackageRenewFlagRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyPackageRenewFlag", ModifyPackageRenewFlagResponse.class);
    }

    /**
     *Purchase a Prepaid Traffic Package
     * @param req OrderFlowPackageRequest
     * @return OrderFlowPackageResponse
     * @throws TencentCloudSDKException
     */
    public OrderFlowPackageResponse OrderFlowPackage(OrderFlowPackageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OrderFlowPackage", OrderFlowPackageResponse.class);
    }

    /**
     *Purchase a single-use License
     * @param req OrderPerLicenseRequest
     * @return OrderPerLicenseResponse
     * @throws TencentCloudSDKException
     */
    public OrderPerLicenseResponse OrderPerLicense(OrderPerLicenseRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "OrderPerLicense", OrderPerLicenseResponse.class);
    }

    /**
     *Users report custom order information, and the Multiple Network Acceleration service saves the information related to.
     * @param req ReportOrderRequest
     * @return ReportOrderResponse
     * @throws TencentCloudSDKException
     */
    public ReportOrderResponse ReportOrder(ReportOrderRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ReportOrder", ReportOrderResponse.class);
    }

    /**
     *This API is used to set user traffic alarm information. Use this API setting to configure the data transfer plan alarm threshold as well as the callback url and key when an alarm is generated.
     * @param req SetNotifyUrlRequest
     * @return SetNotifyUrlResponse
     * @throws TencentCloudSDKException
     */
    public SetNotifyUrlResponse SetNotifyUrl(SetNotifyUrlRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SetNotifyUrl", SetNotifyUrlResponse.class);
    }

    /**
     *Update application information
     * @param req UpdateApplicationInfoRequest
     * @return UpdateApplicationInfoResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApplicationInfoResponse UpdateApplicationInfo(UpdateApplicationInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateApplicationInfo", UpdateApplicationInfoResponse.class);
    }

    /**
     *Update application key
     * @param req UpdateApplicationKeyRequest
     * @return UpdateApplicationKeyResponse
     * @throws TencentCloudSDKException
     */
    public UpdateApplicationKeyResponse UpdateApplicationKey(UpdateApplicationKeyRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateApplicationKey", UpdateApplicationKeyResponse.class);
    }

    /**
     *Update device information
     * @param req UpdateDeviceRequest
     * @return UpdateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDeviceResponse UpdateDevice(UpdateDeviceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateDevice", UpdateDeviceResponse.class);
    }

    /**
     *Update group remark
     * @param req UpdateGroupRequest
     * @return UpdateGroupResponse
     * @throws TencentCloudSDKException
     */
    public UpdateGroupResponse UpdateGroup(UpdateGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateGroup", UpdateGroupResponse.class);
    }

    /**
     *Refresh hardware info
     * @param req UpdateHardwareRequest
     * @return UpdateHardwareResponse
     * @throws TencentCloudSDKException
     */
    public UpdateHardwareResponse UpdateHardware(UpdateHardwareRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateHardware", UpdateHardwareResponse.class);
    }

    /**
     *Update the interconnection rule CIDR
     * @param req UpdateL3CidrRequest
     * @return UpdateL3CidrResponse
     * @throws TencentCloudSDKException
     */
    public UpdateL3CidrResponse UpdateL3Cidr(UpdateL3CidrRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateL3Cidr", UpdateL3CidrResponse.class);
    }

    /**
     *Update the interconnection rule remark
     * @param req UpdateL3ConnRequest
     * @return UpdateL3ConnResponse
     * @throws TencentCloudSDKException
     */
    public UpdateL3ConnResponse UpdateL3Conn(UpdateL3ConnRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateL3Conn", UpdateL3ConnResponse.class);
    }

    /**
     *Update the interconnection rule switch
     * @param req UpdateL3SwitchRequest
     * @return UpdateL3SwitchResponse
     * @throws TencentCloudSDKException
     */
    public UpdateL3SwitchResponse UpdateL3Switch(UpdateL3SwitchRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "UpdateL3Switch", UpdateL3SwitchResponse.class);
    }

}
