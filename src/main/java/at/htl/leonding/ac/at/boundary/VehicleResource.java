package at.htl.leonding.ac.at.boundary;

import at.htl.leonding.ac.at.control.VehicleRepository;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("vehicle")
public class VehicleResource {

    @Inject
    VehicleRepository vehicleRepository;

    @GET
    public Response getAll() {
        return Response.ok(
                vehicleRepository.listAll()
                ).build();
    }

}
