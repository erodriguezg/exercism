package exercism.lasagna;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LasagnaTest {

    @Test
    @Tag("task:1")
    @DisplayName("The expectedMinutesInOven method returns the correct value")
    void expected_minutes_in_oven() {
        assertThat(new Lasagna().expectedMinutesInOven()).isEqualTo(40);
    }

    @Test
    @Tag("task:2")
    @DisplayName("The remainingMinutesInOven method calculates and returns the correct value")
    void remaining_minutes_in_oven() {
        assertThat(new Lasagna().remainingMinutesInOven(25)).isEqualTo(15);
    }

    @Test
    @Tag("task:3")
    @DisplayName("The preparationTimeInMinutes method calculates the correct value for single layer")
    void preparation_time_in_minutes_for_one_layer() {
        assertThat(new Lasagna().preparationTimeInMinutes(1)).isEqualTo(2);
    }

    @Test
    @Tag("task:3")
    @DisplayName("The preparationTimeInMinutes method calculates the correct value for multiple layers")
    void preparation_time_in_minutes_for_multiple_layers() {
        assertThat(new Lasagna().preparationTimeInMinutes(4)).isEqualTo(8);
    }

    @Test
    @Tag("task:4")
    @DisplayName("The totalTimeInMinutes method calculates the correct value for single layer")
    void total_time_in_minutes_for_one_layer() {
        assertThat(new Lasagna().totalTimeInMinutes(1, 30)).isEqualTo(32);
    }

    @Test
    @Tag("task:4")
    @DisplayName("The totalTimeInMinutes method calculates the correct value for multiple layers")
    void total_time_in_minutes_for_multiple_layers() {
        assertThat(new Lasagna().totalTimeInMinutes(4, 8)).isEqualTo(16);
    }

}