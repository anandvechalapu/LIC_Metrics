@Repository
public interface ProcessPolicyMemberByServiceIdSupportController5Repository {
	
	/**
	 * API endpoint to process bulk policy members' merger/conversion fund-related details using a service ID, so that member 
	 * transaction entries/debits can be made efficiently
	 *
	 * @param serviceId The serviceId path parameter should be a valid Long value
	 * @return CommonResponseDto<Map<String,String>> containing the status of the request and an appropriate message
	 * @throws RequiredFieldException If the {serviceId} is invalid, throw a RequiredFieldException with an appropriate error message
	 * @throws ApplicationException If an ApplicationException is thrown, catch it and set the CommonResponseDto status field to ERROR, with an appropriate error message in the response message field
	 */
	public CommonResponseDto<Map<String, String>> processPolicyMemberByServiceId(Long serviceId) throws RequiredFieldException, ApplicationException;
}